/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;


public class Materials {

    
    private int MaterialsID;
    private String Name;
    private int Length;
    private int Stock;
    private int Price;
    private String Description;
    private int Type_idType;

/*
private int id;
private int type;
private int Length;
*/

    public Materials(int MaterialsID, String Name, int Length, int Stock, int Price, String Description, int Type_idType) {
        this.MaterialsID = MaterialsID;
        this.Name = Name;
        this.Length = Length;
        this.Stock = Stock;
        this.Price = Price;
        this.Description = Description;
        this.Type_idType = Type_idType;
    }

    public int getMaterialsID()
    {
        return MaterialsID;
    }

    public void setMaterialsID(int MaterialsID)
    {
        this.MaterialsID = MaterialsID;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public int getLength()
    {
        return Length;
    }

    public void setLength(int Length)
    {
        this.Length = Length;
    }

    public int getStock()
    {
        return Stock;
    }

    public void setStock(int Stock)
    {
        this.Stock = Stock;
    }

    public int getPrice()
    {
        return Price;
    }

    public void setPrice(int Price)
    {
        this.Price = Price;
    }

    public String getDesp()
    {
        return Description;
    }

    public void setDesp(String Description)
    {
        this.Description = Description;
    }

    public int getType()
    {
        return Type_idType;
    }

    public void setType(int Type_idType)
    {
        this.Type_idType = Type_idType;
    }

    @Override
    public String toString()
    {
        return "Materials{" + "MaterialsID=" + MaterialsID + ", Name=" + Name + ", Length=" + Length + ", Stock=" + Stock + ", Price=" + Price + ", Description=" + Description + ", Type=" + Type_idType + '}';
    }


    

    
    
}
