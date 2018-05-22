/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;


public class Order
{
       private java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
    private int IDorder;
    private int Width;
    private int Length;
    private int Height;
    
    // boolean skur;
    // int carportType;
    

    public Order(int IDorder, int Width, int Length, int Height) {
        this.IDorder = IDorder;
        this.Width = Width;
        this.Length = Length;
        this.Height = Height;
    }

    
    public Order(int IDorder) {
        this.IDorder = IDorder;
    }
    

    public int getIDorder() {
        return IDorder;
    }

    public void setIDorder(int IDorder) {
        this.IDorder = IDorder;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int Width) {
        this.Width = Width;
    }

    public int getLength() {
        return Length;
    }

    public void setLength(int Length) {
        this.Length = Length;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int Height) {
        this.Height = Height;
    }
    
    @Override
    public String toString()
    {
        return "Order{" + "IDorder=" + IDorder + ", Width=" + Width + ", Length=" + Length + ", Height=" + Height + '}';
    }
        
}
