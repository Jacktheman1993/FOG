package FunctionLayer;

import DBAccess.OrderMapper;
import DBAccess.UserMapper;
import DBAccess.MaterialMapper;
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

    public static int createOrder(User user, int width, int length, int height, boolean shed, boolean status) throws LoginSampleException, SQLException
    {
        return OrderMapper.createOrder(user, width, length, height, shed, status);
    }

    public static void updateMaterial( String Name, int Length, int Stock, double Price, String Description, int MaterialsID) throws LoginSampleException {
    MaterialMapper.updateMaterial( Name, Length, Stock, Price, Description, MaterialsID);
    }
}
