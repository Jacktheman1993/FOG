/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

import java.sql.Date;
//import java.util.Calendar;
/**
 *
 * @author Martin
 */
public class Order
{
//    private java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
    private int IDorder;
    private int width;
    private int length;
    private int height;

    public Order(int IDorder, int width, int length, int height) {
        this.IDorder = IDorder;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public Order(int orderID) {
        this.IDorder = IDorder;
    }

    public int getIDorder() {
        return IDorder;
    }

    public void setIDorder(int IDorder) {
        this.IDorder = IDorder;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Order{" + "IDorder=" + IDorder + ", width=" + width + ", length=" + length + ", height=" + height + '}';
    }


}
    