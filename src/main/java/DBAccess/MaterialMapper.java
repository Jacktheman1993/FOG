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
 * @author Javadoc by Simon
 */
public class MaterialMapper {
    
    /**
     *
     * @param MaterialsID
     * @param Name
     * @param Length
     * @param Stock
     * @param Price
     * @param Description
     * @param Name_T
     * @throws LoginSampleException
     */
    public static int createMaterial(int MaterialsID, String Name, int Length, int Stock, double Price, String Description, String Name_T) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO `Materials` natural join Type( Name, Length Stock, Price, Description, Name_T ) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setInt( 1, MaterialsID);
            ps.setString( 2, Name);
            ps.setInt( 3, Length);
            ps.setDouble( 4, Price);
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

    /**
     *
     * @param MaterialsID
     * @return Price for a material found by id
     * @throws LoginSampleException
     * @throws SQLException
     */
    public static double getPrice(int MaterialsID) throws LoginSampleException, SQLException
    {
        try{
            Connection con = Connector.connection();
            String SQL = "select Materials.Price from Materials where Materials.MaterialsID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, MaterialsID);
            ResultSet rs = ps.executeQuery();

            if (rs.next())
            {
                double mat = rs.getDouble("Price");

            return mat;
                
            } else
            {
             throw new LoginSampleException("Can't find price");
            }
            
        }    catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException( ex.getMessage() );
        }
    }
    
    /**
     *
     * @param Name
     * @param Length
     * @param Stock
     * @param Price
     * @param Description
     * @param MaterialsID
     * @throws LoginSampleException
     */
    public static void updateMaterial( String Name, int Length, int Stock, double Price, String Description, int MaterialsID) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "UPDATE `Materials`"
                    + " SET MaterialsID= ?, "
                    + "`Name`= ?,"
                    + " Length= ?, "
                    + "Stock= ?, "
                    + "Price= ?, "
                    + "Description= ? "
                    + "where MaterialsID = ?;";
            
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setInt( 1, MaterialsID);
            ps.setString( 2, Name);
            ps.setInt( 3, Length);
            ps.setInt( 4, Stock);
            ps.setDouble( 5, Price);
            ps.setString( 6, Description);
            ps.setInt( 7, MaterialsID);
            ps.executeUpdate();
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginSampleException( ex.getMessage() );
        }
    }
    
    // Alessandro & Simon

    /**
     *
     * @return All Materials in an ArrayList
     * @throws LoginSampleException
     */
            public static ArrayList<Materials> getMaterials() throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "select Materials.MaterialsID, Materials.Name, Materials.Length, Materials.Stock, Materials.Price, Materials.Description,Type.Name_T from Materials,Type where Materials.Type_idType=Type.idType Order by MaterialsID;";
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
            
    /**
     *
     * @param MaterialsID
     * @return The description of a material, found by the id.
     * @throws LoginSampleException
     * @throws SQLException
     */
    public static String getDesc(int MaterialsID) throws LoginSampleException, SQLException
    {
        try{
            Connection con = Connector.connection();
            String SQL = "select Materials.Description from Materials where Materials.MaterialsID = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, MaterialsID);
            ResultSet rs = ps.executeQuery();

            if (rs.next())
            {
                String mat = rs.getString("Description");

            return mat;
                
            } else
            {
             throw new LoginSampleException("Can't find Description");
            }
            
        }    catch (ClassNotFoundException | SQLException ex) {
            throw new LoginSampleException( ex.getMessage() );
        }
    }
    
    
    
            
    
    }
