/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import DBAccess.OrderMapper;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author The Overlord
 */
@WebServlet("/logout")
public class Logout extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        request.getSession().invalidate();
        response.sendRedirect(request.getContextPath() + "/index.jsp");
        
//        HttpSession newsession = request.getSession(false);
//        if(newsession != null)
//        {
//            newsession.invalidate();
//        }
//        response.sendRedirect("../index.jsp");
    }

    
}
