/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import DBAccess.MaterialMapper;
import DBAccess.OrderMapper;
import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Materials;
import FunctionLayer.Order;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Martin
 */
public class UpdateStatus extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException{
        int idOrder = Integer.parseInt(request.getParameter( "idOrder" ));
        String getstatus = request.getParameter( "status" );
        boolean status = false;
        
        status = "status_yes".equals(getstatus);
        
        request.setAttribute("statusBool", status);
        
        LogicFacade.updateOrderStatus(idOrder, status);
        
        return "updatestatus";
    }
}
