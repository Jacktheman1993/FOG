package PresentationLayer;

import DBAccess.OrderMapper;
import DBAccess.UsersOrderMapper;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sun.security.pkcs11.wrapper.Functions;
import javax.servlet.http.HttpSession;

//Copy of AllOrders

public class AllUserOrder extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        
        ArrayList<Order> Uord = UsersOrderMapper.getUsersOrders();
        
        request.setAttribute("allUsersOrder", Uord);
        
        return "allUsersOrders";

    }
    
}