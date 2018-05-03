/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import DBAccess.OrderMapper;
import FunctionLayer.LoginSampleException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author simon
 */
public class NewOrder extends Command {

    public NewOrder() {
    }

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        
        int getwidth = Integer.parseInt(request.getParameter( "width" ));
        int getlength = Integer.parseInt(request.getParameter("length"));
        int getheight = Integer.parseInt(request.getParameter("height"));
  
        int[] result = new int[3];
        result[0] = getwidth;
        result[1] = getlength;
        result[2] = getheight;
        
        request.setAttribute("itemlist", result);
        
        OrderMapper.createOrder(getwidth, getlength, getheight);
        
        return "neworder";
    }
    
}
