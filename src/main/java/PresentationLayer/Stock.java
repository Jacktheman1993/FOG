/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import DBAccess.MaterialMapper;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Materials;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alek
 */
 public class Stock extends Command {

    public Stock() {
    }

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        
        //int getMaterialsID = Integer.parseInt(request.getParameter( "MaterialsID" ));
        //String getMaterialsName = request.getParameter("MaterialsName");
        //int getMaterialsInStock = Integer.parseInt(request.getParameter("MaterialsInStock"));
        
        //int[] stock = new int[2];
        //stock[0] = getMaterialsID;
        //result[1] = getMaterialsName;
        //stock[1] = getMaterialsInStock;
        
        ArrayList<Materials> mat = MaterialMapper.getMaterials();
        
        request.setAttribute("Stock", mat);
        
        return "stock";
    }
    
}
