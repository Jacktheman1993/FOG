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

// Alessandro & Simon

 public class Stock extends Command {

    public Stock() {
    }

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {

        ArrayList<Materials> mat = MaterialMapper.getMaterials();
        
        request.setAttribute("Stock", mat);
        
        return "stock";
    }
    
}
