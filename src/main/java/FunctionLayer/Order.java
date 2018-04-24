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
    private int OrderDate;
    private int PriceTotal;
    private String Address;
    private String Phone;
    
    public Order(int idOrder, int OrderDate, int PriceTotal, String Address, String Phone) {
        this.idOrder = idOrder;
        this.OrderDate = OrderDate;
        this.PriceTotal = PriceTotal;
        this.Address = Address;
        this.Phone = Phone;
    }
    public Order(int idOrder){
        this.idOrder = idOrder;
        
        
    }

    public int getIdOrder()
    {
        return idOrder;
    }

    public void setIdOrder(int idOrder)
    {
        this.idOrder = idOrder;
    }

    public int getOrderDate()
    {
        return OrderDate;
    }

    public void setOrderDate(int OrderDate)
    {
        this.OrderDate = OrderDate;
    }

    public int getPriceTotal()
    {
        return PriceTotal;
    }

    public void setPriceTotal(int PriceTotal)
    {
        this.PriceTotal = PriceTotal;
    }

    public String getAddress()
    {
        return Address;
    }

    public void setAddress(String Address)
    {
        this.Address = Address;
    }

    public String getPhone()
    {
        return Phone;
    }

    public void setPhone(String Phone)
    {
        this.Phone = Phone;
    }

    @Override
    public String toString()
    {
        return "Order{" + "idOrder=" + idOrder + ", OrderDate=" + OrderDate + ", PriceTotal=" + PriceTotal + ", Address=" + Address + ", Phone=" + Phone + '}';
    }
            
}
