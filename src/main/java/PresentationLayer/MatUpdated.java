/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import loggingdemo.Conf;

/**
 *
 * @author Alek
 */
public class MatUpdated extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException{
        int MaterialsID = Integer.parseInt(request.getParameter( "ID" ));
        String name = request.getParameter( "Name" );
        int length = Integer.parseInt(request.getParameter("Length"));
        int stock = Integer.parseInt(request.getParameter("Stock"));
        int price = Integer.parseInt(request.getParameter("Price"));
        String description = request.getParameter( "Description" );
        
        LogicFacade.updateMaterial(name, length, stock, price, description, MaterialsID);
        return "stock";
    }
    
}
