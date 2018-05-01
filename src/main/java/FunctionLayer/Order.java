/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

/**
 *
 * @author Martin
 */
public class Order
{
    private int idOrder;
    private String OrderDate;
    private int PriceTotal;
    private String Address;
    private int Phone;

    public Order(int idOrder, String OrderDate, int PriceTotal, String Address, int Phone) {
        this.idOrder = idOrder;
        this.OrderDate = OrderDate;
        this.PriceTotal = PriceTotal;
        this.Address = Address;
        this.Phone = Phone;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String OrderDate) {
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
