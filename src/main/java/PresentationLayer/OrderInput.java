package PresentationLayer;

import DBAccess.OrderMapper;
import FunctionLayer.LoginSampleException;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Simon

public class Orderinput extends Command {

    

    @Override
String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {    
        
        return "orderinput";
    }
    
}
