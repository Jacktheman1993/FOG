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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Martin
 */
public class OrderMapper
{
    public static int createOrder( User user, int idOrder, int OrderDate, int PriceTotal, String Address, String Phone ) throws LoginSampleException {
//public static int createOrder( int id, int height, int length, int width ) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO `Order` ( idOrder, OrderDate, PriceTotal, Address, Phone) VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setInt( 1, idOrder);
            ps.setInt( 2, OrderDate );
            ps.setInt( 3, PriceTotal );
            ps.setString( 4, Address);
            ps.setString( 5, Phone);
//            ps.setInt( 4, id);
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
//            int id = ids.getInt( 1 );
            return ids.getInt( 1 );
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginSampleException( ex.getMessage() );
        }
    }
        public static Order getOrder( int idOrder ) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "select * from `Order` where idOrder = ?";
            PreparedStatement ps = con.prepareStatement( SQL );
            ps.setInt( 1, idOrder );
            ResultSet rs = ps.executeQuery();
            if ( rs.next() ) {
                
                Order getorder = new Order(idOrder);
                getorder.setOrderDate(rs.getInt("OrderDate"));
                getorder.setPriceTotal(rs.getInt("PriceTotal"));
                getorder.setAddress(rs.getString("Address"));
                getorder.setPhone(rs.getString("Phone"));
                return getorder;
//                String orderID = rs.getString( "orderID" );
//                getorder.setOrderID(orderID);
//                return rs;
            } else {
                throw new LoginSampleException( "Something went wrong" );
            }
        } catch ( ClassNotFoundException | SQLException ex ) {
            throw new LoginSampleException(ex.getMessage());
        }
    }
}
