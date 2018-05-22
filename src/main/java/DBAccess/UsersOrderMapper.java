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

/**
 *
 * @author Martin
 */
public class UsersOrderMapper
{

    java.sql.Date date1 = new java.sql.Date(Calendar.getInstance().getTime().getTime());

//lav ny getorder til inviduil user/kunde
    public static Order getUserOrder(int idOrder) throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "select * from `Orders` where Users_id = idOrder";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, idOrder);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                Order getuserorder = new Order(idOrder);
                getuserorder.setIDorder(idOrder);
                getuserorder.setWidth(rs.getInt("Width"));
                getuserorder.setLength(rs.getInt("Length"));
                getuserorder.setHeight(rs.getInt("Height"));
                return getuserorder;
            }
            else
            {
                throw new LoginSampleException("ERROR: SOmething went wrong: Contact IT");
            }
        }
        catch (ClassNotFoundException | SQLException ex)
        {
            throw new LoginSampleException(ex.getMessage());
        }
    }

    public static ArrayList<Order> getUsersOrders() throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "select * from `Orders` where Users_id = idOrder";
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
            }
            else
            {
                throw new LoginSampleException("Something went wrong: list size is less than 1 (no orders yet)");
            }
        }
        catch (ClassNotFoundException | SQLException ex)
        {
            throw new LoginSampleException(ex.getMessage());
        }

    }
}
