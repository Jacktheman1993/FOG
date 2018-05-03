package FunctionLayer;

import DBAccess.OrderMapper;
import DBAccess.UserMapper;
import java.sql.SQLException;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }
public static Order getOrder(int idOrder) throws Exception
    {
        return OrderMapper.getOrder(idOrder);
    }
public static Order createOrder(User user, int width, int length) throws LoginSampleException, SQLException {
    Order order = new Order(width, length);
    OrderMapper.createOrder(user, width, length );
    return order;
}
}
