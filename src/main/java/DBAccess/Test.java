/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBAccess;

import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import FunctionLayer.User;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Martin
 */
public class Test
{
    public static void main(String[] args) throws Exception
    {
java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
//        ArrayList<Order> i = OrderMapper.getOrders();
//        System.out.println(i);

//  int k = OrderMapper.createOrder(4, date, 4500, "Jægersborg", "00000000");
                
    // Order o = OrderMapper.getOrder(1);
    //System.out.println("order " + o);
User u = new User("test@test.dk", "pass", "customer");
//        int createdOrderID = OrderMapper.createOrder(u, 1, 5, 10, "Lars", "Phone");
//     System.out.println(createdOrderID);
        int ord = OrderMapper.createOrder(u, 44, 44);
        System.out.println("Order pl0x????" + ord);

    }
}
