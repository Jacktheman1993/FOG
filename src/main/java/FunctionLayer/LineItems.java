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
    String tekst;
    int type;

    public LineItems(int Orders_idOrder, int Materials_MaterialsID, int Amount, int Price) {
        this.Orders_idOrder = Orders_idOrder;
        this.Materials_MaterialsID = Materials_MaterialsID;
        this.Amount = Amount;
        this.Price = Price;
//        this.tekst = tekst;
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
 

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "LineItems{" + "Orders_idOrder=" + Orders_idOrder + ", Materials_MaterialsID=" + Materials_MaterialsID + ", Amount=" + Amount + ", Price=" + Price + ", tekst=" + tekst + ", type=" + type + '}';
    }


}
