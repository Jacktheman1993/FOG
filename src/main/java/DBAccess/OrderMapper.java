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
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;


public class OrderMapper
{

    java.sql.Date date1 = new java.sql.Date(Calendar.getInstance().getTime().getTime());
// Martin
public static int createOrder(User user, int width, int length, int height, int shed) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO `Orders` (Users_id, width, length, height, shed ) VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setInt( 1, user.getId());
            ps.setInt( 2, width);
            ps.setInt( 3, length );
            ps.setInt( 4, height );
            ps.setInt(5, shed );
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            return ids.getInt( 1 );
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginSampleException( ex.getMessage() );
        }
    }

//Martin
    public static Order getOrder(int idOrder) throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
//            java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
            String SQL = "select * from `Orders` where idOrder = ?";
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
// Simon
    public static ArrayList<Order> getOrders() throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "select * from `Orders`";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            ArrayList<Order> list = new ArrayList<>();
            ArrayList<LineItems> lineItems = new ArrayList<>();
            while (rs.next())
            {
                list.add(new Order(rs.getInt("idOrder"), rs.getInt("Width"), rs.getInt("Length"), rs.getInt("Height"), rs.getInt("Shed")));
            }
            if (list.size() > 0)
            {
                return list;
            } else
            {
                throw new LoginSampleException("Something went wrong: list size is less than 1 (no orders yet)");
            }
        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new LoginSampleException(ex.getMessage());
        }
    }
    
    //Nicolai
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
