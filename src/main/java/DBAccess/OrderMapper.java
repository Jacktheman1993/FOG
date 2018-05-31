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

    public static int createOrder(User user, int width, int length, int height, boolean shed, boolean status) throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO `Orders` (Users_id, width, length, height, shed, status ) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, user.getId());
            ps.setInt(2, width);
            ps.setInt(3, length);
            ps.setInt(4, height);
            ps.setBoolean(5, shed);
            ps.setBoolean(6, status);
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            return ids.getInt(1);
        } catch (SQLException | ClassNotFoundException ex)
        {
            throw new LoginSampleException(ex.getMessage());
        }
    }

//Martin
    public static Order getOrder(int idOrder) throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "select * from `Orders` where idOrder = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idOrder);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {

                Order getorder = new Order(idOrder);
                getorder.setIDorder(idOrder);
                getorder.setWidth(rs.getInt("Width"));
                getorder.setLength(rs.getInt("Length"));
                getorder.setHeight(rs.getInt("Height"));
                return getorder;

            } else
            {
                throw new LoginSampleException("Could not find an order: OrderID is not used yet");
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
            String SQL = "select Orders.IDorder, Orders.Width, Orders.Length, Orders.Height, Orders.Shed, Orders.Status, Users.id from Orders, Users where Orders.Users_id = Users.id";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            ArrayList<Order> list = new ArrayList<>();
            ArrayList<LineItems> lineItems = new ArrayList<>();
            while (rs.next())
            {
                list.add(new Order(rs.getInt("id"), rs.getInt("idOrder"), rs.getInt("Width"), rs.getInt("Length"), rs.getInt("Height"), rs.getBoolean("Shed"), rs.getBoolean("Status")));
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
    public static ArrayList<Order> getUserOrders() throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "select * from `Orders` inner join Users on Orders.Users_id = Users.id where id = 1";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            ArrayList<Order> list = new ArrayList<>();
            while (rs.next())
            {
                list.add(new Order(rs.getInt("id"), rs.getInt("idOrder"), rs.getInt("Width"), rs.getInt("Length"), rs.getInt("Height"), rs.getBoolean("Shed"), rs.getBoolean("Status")));
            }
            if (list.size() > 0)
            {
                return list;
            } else
            {
                throw new LoginSampleException("Something went wrong");
            }
        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new LoginSampleException(ex.getMessage());
        }
    }

    public static void updateOrderStatus(int idOrder, boolean status) throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "UPDATE `Orders` "
                    + "SET Status = ? "
                    + "where idOrder = ?;";

            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);

            ps.setBoolean(1, status);
            ps.setInt(2, idOrder);
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex)
        {
            throw new LoginSampleException("Failed to update status. Check inputs made by user and see if they are correct.");
        }
    }
}
