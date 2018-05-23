/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;

import FunctionLayer.LineItems;
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
    
    public static int createMaterial(int MaterialsID, String Name, int Length, int Stock, int Price, String Description, String Name_T) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO `Materials` natural join Type( Name, Length Stock, Price, Description, Name_T ) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setInt( 1, MaterialsID);
            ps.setString( 2, Name);
            ps.setInt( 3, Length);
            ps.setInt( 4, Price);
            ps.setString( 5, Description);
            ps.setString( 6, Name_T);
            
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            return ids.getInt( 1 );
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginSampleException( ex.getMessage() );
        }
    }
    
    // Alessandro & Simon
            public static ArrayList<Materials> getMaterials() throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "select Materials.MaterialsID, Materials.Name, Materials.Length, Materials.Stock, Materials.Price, Materials.Description,Type.Name_T from Materials,Type where Materials.Type_idType=Type.idType;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

               ArrayList<Materials> mats = new ArrayList<>();
            while (rs.next())
            {
                mats.add(new Materials(rs.getInt("MaterialsID"), rs.getString("Name"), rs.getInt("Length"), rs.getInt("Stock"), rs.getInt("Price"), rs.getString("Description"), rs.getString("Name_T")));
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
            public static LineItems getLineItems(int Amount, int Price) throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
//            java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            String SQL = "select * from `LineItems`";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                LineItems li = new LineItems(Amount, Price);

                li.setAmount(rs.getInt("Amount"));
                li.setPrice(rs.getInt("Price"));
                return li;
//                String orderID = rs.getString( "orderID" );
//                getorder.setOrderID(orderID);
//                return rs;
            } else
            {
                throw new LoginSampleException("Something went wrong: OrderID is not used yet");
            }
        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new LoginSampleException(ex.getMessage());
        }
    }
    }
