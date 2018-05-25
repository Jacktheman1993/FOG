package FunctionLayer;

//Simon


public class LineItems {
    
    int Orders_idOrder, Materials_MaterialsID, Amount; 
    double Price;
    String Name;
    String Description;
    int Length;

    public LineItems(int Orders_idOrder, int Materials_MaterialsID, String Name, String Description, int Length, int Amount, double Price) {
        this.Orders_idOrder = Orders_idOrder;
        this.Materials_MaterialsID = Materials_MaterialsID;
        this.Amount = Amount;
        this.Price = Price;
        this.Name = Name;
        this.Description = Description;
        this.Length = Length;
    }

    public LineItems(int Materials_MaterialsID, int Amount) {
        this.Materials_MaterialsID = Materials_MaterialsID;
        this.Amount = Amount;
    }

 public LineItems(int Amount){
     this.Amount = Amount;
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

    public double getPrice()
    {
        return Price;
    }

    public void setPrice(double Price)
    {
        this.Price = Price;
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
    public String toString() {
        return "LineItems{" + "Orders_idOrder=" + Orders_idOrder + ", Materials_MaterialsID=" + Materials_MaterialsID + ", Amount=" + Amount + ", Price=" + Price + ", Name=" + Name + ", Description=" + Description + ", Length=" + Length + '}';
    }





}
