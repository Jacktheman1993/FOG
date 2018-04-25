/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;

import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import FunctionLayer.User;

/**
 *
 * @author Martin
 */
public class Test
{
    public static void main(String[] args) throws Exception
    {

        
      Order o = OrderMapper.getOrder(1);
      System.out.println("order " + o);
//       User u = new User("test@test.dk", "pass", "customer");
//        int createdOrderID = OrderMapper.createOrder(u, 1, 5, 10, "Lars", "Phone");
//     System.out.println(createdOrderID);
    }
}
