package PresentationLayer;


import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import loggingdemo.Conf;


// Simon

public class NewOrder extends Command {

    public NewOrder() {
    }

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        
        int getwidth = Integer.parseInt(request.getParameter( "width" ));
        int getlength = Integer.parseInt(request.getParameter("length"));
        int getheight = Integer.parseInt(request.getParameter("height"));
        int isShed = Integer.parseInt(request.getParameter("shed"));
        
        if(getwidth > 1000 || getwidth < 400){
            return "orderinput";
        }
                
        if(getlength > 2000 || getlength < 400){
            return "orderinput";
        }
                
        if(getheight > 300 || getheight < 200){
            return "orderinput";
        }
        
        else{
        int[] result = new int[4];
        result[0] = getwidth;
        result[1] = getlength;
        result[2] = getheight;
        result[3] = isShed;
        
        request.setAttribute("itemlist", result);
        User user = (User)request.getSession().getAttribute("user");
            try
            {
                LogicFacade.createOrder(user, getwidth, getlength, getheight, isShed);
            } catch (SQLException ex)
            {
                Conf.MYLOGGER.log(Level.SEVERE, null, ex);
            }
        
        return "neworder";
        }
    }  
}
