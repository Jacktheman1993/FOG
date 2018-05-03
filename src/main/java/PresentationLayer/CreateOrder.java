/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;
import FunctionLayer.Calc;
import DBAccess.OrderMapper;
import DBAccess.UserMapper;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Martin
 */
public class CreateOrder extends Command
{
@Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        int getwidth = Integer.parseInt(request.getParameter( "width" ));
        int getlength = Integer.parseInt(request.getParameter("length"));
        Calc itemList = new Calc();
        int[] result = itemList.result(getlength, getwidth);
        
        request.setAttribute("itemlist", result);
        User user = (User)request.getSession().getAttribute("user");

   
        OrderMapper.createOrder(user, getwidth, getlength);

        return "order";
}
}

