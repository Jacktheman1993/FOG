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
        ArrayList<Order> i = OrderMapper.getOrders();
        System.out.println(i);

                
    //Order o = OrderMapper.getOrder(3);
    //System.out.println("order " + o);
    User u = new User("test@test.dk", "pass", "customer");
    int ord = OrderMapper.createOrder(123123123, 10, 15);
    System.out.println("New Order" + ord);

    }
}
