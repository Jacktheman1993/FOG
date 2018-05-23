package DBAccess;

import FunctionLayer.LineItems;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import FunctionLayer.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 The purpose of UserMapper is to...

 @author kasper
 */
public class UserMapper {

    public static void createUser( User user ) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO Users (Email, Password, Role) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setString( 1, user.getEmail() );
            ps.setString( 2, user.getPassword() );
            ps.setString( 3, user.getRole() );
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt( 1 );
            user.setId( id );
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginSampleException( ex.getMessage() );
        }
    }

    public static User login( String Email, String Password ) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT id, Role FROM Users "
                    + "WHERE Email=? AND Password=?";
            PreparedStatement ps = con.prepareStatement( SQL );
            ps.setString( 1, Email );
            ps.setString( 2, Password );
            ResultSet rs = ps.executeQuery();
            if ( rs.next() ) {
                String Role = rs.getString( "Role" );
                int id = rs.getInt( "id" );
                User user = new User( Email, Password, Role );
                user.setId( id );
                return user;
            } else {
                throw new LoginSampleException( "Could not validate user" );
            }
        } catch ( ClassNotFoundException | SQLException ex ) {
            throw new LoginSampleException(ex.getMessage());
        }
    }
    //Copied from GetOrders()
        public static ArrayList<User> getUsers() throws LoginSampleException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "select * from `Users`";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            ArrayList<User> usList = new ArrayList<>();
                        while (rs.next())
            {
                usList.add(new User(rs.getString("Email"), rs.getString("Password"), rs.getString("Role")));
            }
            if (usList.size() > 0)
            {
                return usList;
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
