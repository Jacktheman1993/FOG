package PresentationLayer;

import DBAccess.OrderMapper;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sun.security.pkcs11.wrapper.Functions;
import javax.servlet.http.HttpSession;

public class allUserOrdre extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        
        ArrayList<Order> ord = OrderMapper.getOrders();
        
        request.setAttribute("allOrders", ord);
        
        return "allOrders";

    }
    
}