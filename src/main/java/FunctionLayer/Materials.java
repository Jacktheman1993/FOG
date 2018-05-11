/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

/**
 *
 * @author Alek
 */
public class Materials {
       
    private int MaterialsID;
    private String MaterialsName;
    private int MaterialsInStock;
    private int Pris;
    private int Type;
    private int length;

    public Materials(int MaterialsID, String MaterialsName, int MaterialsInStock, int Pris, int Type, int length) {
        this.MaterialsID = MaterialsID;
        this.MaterialsName = MaterialsName;
        this.MaterialsInStock = MaterialsInStock;
        this.Pris = Pris;
        this.Type = Type;
        this.length = length;
    }

    public Materials(int MaterialsID) {
        this.MaterialsID = MaterialsID;
    }

    public int getMaterialsID() {
        return MaterialsID;
    }

    public void setMaterialsID(int MaterialsID) {
        this.MaterialsID = MaterialsID;
    }

    public String getMaterialsName() {
        return MaterialsName;
    }

    public void setMaterialsName(String MaterialsName) {
        this.MaterialsName = MaterialsName;
    }

    public int getMaterialsInStock() {
        return MaterialsInStock;
    }

    public void setMaterialsInStock(int MaterialsInStock) {
        this.MaterialsInStock = MaterialsInStock;
    }

    public int getPris() {
        return Pris;
    }

    public void setPris(int Pris) {
        this.Pris = Pris;
    }

    public int getType() {
        return Type;
    }

    public void setType(int Type) {
        this.Type = Type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Materials{" + "MaterialsID=" + MaterialsID + ", MaterialsName=" + MaterialsName + ", MaterialsInStock=" + MaterialsInStock + ", Pris=" + Pris + ", Type=" + Type + ", length=" + length + '}';
    }
    
    
}
