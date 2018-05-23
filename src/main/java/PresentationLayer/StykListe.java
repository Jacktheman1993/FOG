/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import DBAccess.LineItemMapper;
import FunctionLayer.LineItems;
import FunctionLayer.LoginSampleException;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Simon

public class StykListe extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        
        ArrayList<LineItems> li = LineItemMapper.getLineItems();
        
        request.setAttribute("stykliste", li);
        
        
        return "stykListe";
    }
    
}
