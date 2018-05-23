package FunctionLayer;

import DBAccess.OrderMapper;
import DBAccess.UserMapper;
import java.sql.SQLException;

public class LogicFacade
{

    public static User login(String email, String password) throws LoginSampleException
    {
        return UserMapper.login(email, password);
    }

    public static User createUser(String email, String password) throws LoginSampleException
    {
        User user = new User(email, password, "customer");
        UserMapper.createUser(user);
        return user;
    }

    public static Order getOrder(int idOrder) throws Exception
    {
        return OrderMapper.getOrder(idOrder);
    }

    public static int createOrder(User user, int width, int length, int height, boolean shed) throws LoginSampleException, SQLException
    {
        return OrderMapper.createOrder(user, width, length, height, shed);
    }
}
