/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;

import FunctionLayer.LoginSampleException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import FunctionLayer.Materials;
import java.util.ArrayList;

/**
 *
 * @author Alek
 */
public class MaterialMapper {
    
    public static int createMaterial(int MaterialsID, String MaterialsName, int MaterialsInStock, int Pris, int Type, int length) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO `Materials` ( MaterialsName, MaterialsInStock, Pris, Type, length ) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setInt( 1, MaterialsID);
            ps.setString( 2, MaterialsName);
            ps.setInt( 3, MaterialsInStock);
            ps.setInt( 4, Pris);
            ps.setInt( 5, Type);
            ps.setInt( 6, length );
            
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            return ids.getInt( 1 );
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginSampleException( ex.getMessage() );
        }
    }
            public static ArrayList<Materials> getMaterials() throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "select * from `Materials`";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

               ArrayList<Materials> mats = new ArrayList<>();
            while (rs.next())
            {
                mats.add(new Materials(rs.getInt("MaterialsID"), rs.getString("MaterialsName"), rs.getInt("MaterialsInStock"), rs.getInt("Pris"), rs.getInt("Type"), rs.getInt("length")));
            }
            if (mats.size() > 0)
            {
                return mats;

            } else
            {
                throw new LoginSampleException("Something went wrong: MaterialsID is not used yet");
            }
        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new LoginSampleException(ex.getMessage());
        }
    }
    }
