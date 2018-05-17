/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

/**
 *
 * @author simon
 */
public class LineItems {
    
    int Orders_idOrder, Materials_MaterialsID, Amount, Price;
    String Name;
    String Description;
    int Length;
    int type;

    public LineItems(int Orders_idOrder, int Materials_MaterialsID, String Name, String Description, int Length, int Amount, int Price) {
        this.Orders_idOrder = Orders_idOrder;
        this.Materials_MaterialsID = Materials_MaterialsID;
        this.Amount = Amount;
        this.Price = Price;
        this.Name = Name;
        this.Description = Description;
        this.Length = Length;
//        this.type = type;
    }
    public LineItems(int Amount, int Price) {
        this.Amount = Amount;
        this.Price = Price;
    }

    public int getOrders_idOrder() {
        return Orders_idOrder;
    }

    public void setOrders_idOrder(int Orders_idOrder) {
        this.Orders_idOrder = Orders_idOrder;
    }

    public int getMaterials_MaterialsID() {
        return Materials_MaterialsID;
    }

    public void setMaterials_MaterialsID(int Materials_MaterialsID) {
        this.Materials_MaterialsID = Materials_MaterialsID;
    }
    
    
    public int getAmount()
    {
        return Amount;
    }

    public void setAmount(int Amount)
    {
        this.Amount = Amount;
    }

    public int getPrice()
    {
        return Price;
    }

    public void setPrice(int Price)
    {
        this.Price = Price;
    }
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public String getDescription()
    {
        return Description;
    }

    public void setDescription(String Description)
    {
        this.Description = Description;
    }

    public int getLength()
    {
        return Length;
    }

    public void setLength(int Length)
    {
        this.Length = Length;
    }

    @Override
    public String toString()
    {
        return "Orders_idOrder= " + Orders_idOrder + ", Amount= " + Amount + ", Price= " + Price + " Kr, Name= " + Name + ", Description= " + Description + ", Length= " + Length + " Cm , type= " + type + '}';
    }



}
