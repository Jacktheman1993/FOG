/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;

import FunctionLayer.LineItems;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Materials;
import FunctionLayer.Order;
import FunctionLayer.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;


public class LineItemMapper {

public static int createLineItems(Order order, Materials materials, int Amount, int Price) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO `LineItems` (Users_id, width, length, height ) VALUES (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setInt( 1, order.getIDorder());
            ps.setInt( 2, materials.getMaterialsID());
            ps.setInt( 3, Amount);
            ps.setInt( 4, Price );
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            return ids.getInt( 1 );
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginSampleException( ex.getMessage() );
        }
    }
    public static LineItems getLineItems(int idOrder, int MaterialsID) throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
//            java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            String SQL = "select * from `LineItems` where idOrder = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idOrder);
            ps.setInt(2, MaterialsID);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {

                LineItems getLineItems = new LineItems(idOrder, MaterialsID);
                getLineItems.setOrders_idOrder(idOrder);
                getLineItems.setMaterials_MaterialsID(MaterialsID);
                getLineItems.setAmount(rs.getInt("Amount"));
                getLineItems.setPrice(rs.getInt("Price"));
                return getLineItems;
//                String orderID = rs.getString( "orderID" );
//                getorder.setOrderID(orderID);
//                return rs;
            } else
            {
                throw new LoginSampleException("Something went wrong: idOrder or MaterialsID is not used yet");
            }
        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new LoginSampleException(ex.getMessage());
        }
    }
// Simon & Sandro
    public static ArrayList<LineItems> getLineItems() throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
            //select Materials.MaterialsID, Materials.Name, Materials.Length, Materials.Stock, Materials.Price, Materials.Description,Type.Name_T from Materials,Type where Materials.Type_idType=Type.idType;
            String SQL = "select LineItems.Orders_idOrder,LineItems.Materials_MaterialsID , LineItems.Amount, LineItems.Price, Materials.Name, Materials.Description, Materials.Length from LineItems,Materials where LineItems.Materials_MaterialsID=Materials.MaterialsID;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            ArrayList<LineItems> li = new ArrayList<>();
            while (rs.next())
            {
                li.add(new LineItems(rs.getInt("Orders_idOrder"), rs.getInt("Materials_MaterialsID"), rs.getString("Name"), rs.getString("Description"), rs.getInt("Length"), rs.getInt("Amount"), rs.getInt("Price")));
            }
            if (li.size() > 0)
            {
                return li;
            } else
            {
                throw new LoginSampleException("Something went wrong: list size is less than 1 (no LineItems yet)");
            }
        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new LoginSampleException(ex.getMessage());
        }
    }
    public static Order getUserOrder(int idOrder) throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
//            java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            String SQL = "select * from `Orders` natraul join Users where Users_id = id";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idOrder);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {

                Order getorder = new Order(idOrder);
                getorder.setIDorder(idOrder);
                getorder.setWidth(rs.getInt("Width"));
//                getorder.setOrderDate(date);
                getorder.setLength(rs.getInt("Length"));
                getorder.setHeight(rs.getInt("Height"));
                return getorder;
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


