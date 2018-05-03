/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;

import FunctionLayer.LoginSampleException;
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

/**
 *
 * @author Martin
 */
public class OrderMapper
{

    java.sql.Date date1 = new java.sql.Date(Calendar.getInstance().getTime().getTime());

public static int createOrder(int width, int length, int height) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO `Orders` ( width, length, height ) VALUES (?,?,?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setInt( 1, width);
            ps.setInt( 2, length );
            ps.setInt( 3, height );
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            return ids.getInt( 1 );
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginSampleException( ex.getMessage() );
        }
    }
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
                getorder.setWidth(rs.getInt("width"));
//                getorder.setOrderDate(date);
                getorder.setLength(rs.getInt("length"));
                getorder.setHeight(rs.getInt("height"));
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

    public static ArrayList<Order> getOrders() throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "select * from `Orders`";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            ArrayList<Order> list = new ArrayList<>();
            while (rs.next())
            {
                list.add(new Order(rs.getInt("idOrder"), rs.getInt("width"), rs.getInt("length"), rs.getInt("height")));
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

}
