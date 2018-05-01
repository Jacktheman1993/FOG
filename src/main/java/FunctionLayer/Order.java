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
    private int idOrder;
    private Date OrderDate;
    private int PriceTotal;
    private String Address;
    private int Phone;

    public Order(int idOrder, Date OrderDate, int PriceTotal, String Address, int Phone) {
        this.idOrder = idOrder;
        this.OrderDate = OrderDate;
        this.PriceTotal = PriceTotal;
        this.Address = Address;
        this.Phone = Phone;
    }

    public Order(int idOrder) {
        this.idOrder = idOrder;
    }
    

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date OrderDate) {
        this.OrderDate = OrderDate;
    }

    public int getPriceTotal() {
        return PriceTotal;
    }

    public void setPriceTotal(int PriceTotal) {
        this.PriceTotal = PriceTotal;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    @Override
    public String toString() {
        return "Order{" + "idOrder=" + idOrder + ", OrderDate=" + OrderDate + ", PriceTotal=" + PriceTotal + ", Address=" + Address + ", Phone=" + Phone + '}';
    }
    
    
            
}
