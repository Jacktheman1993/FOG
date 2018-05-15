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
    
    int orderID, materialID, antal, pris;
    String tekst;
    int type;

    public LineItems(int orderID, int materialID, int antal, int pris, String tekst, int type) {
        this.orderID = orderID;
        this.materialID = materialID;
        this.antal = antal;
        this.pris = pris;
        this.tekst = tekst;
        this.type = type;
    }

    public LineItems(int antal, int type) {
        this.antal = antal;
        this.type = type;
    }
    
    

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getMaterialID() {
        return materialID;
    }

    public void setMaterialID(int materialID) {
        this.materialID = materialID;
    }

    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
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
        return "LineItems{" + "orderID=" + orderID + ", materialID=" + materialID + ", antal=" + antal + ", pris=" + pris + ", tekst=" + tekst + ", type=" + type + '}';
    }
    
    
    
    
    
    
    
}
