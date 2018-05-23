package FunctionLayer;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;


public class Order
{
       private java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
       private int id;
    private int IDorder;
    private int Width;
    private int Length;
    private int Height;
    private boolean Shed;
    private boolean Status;
    // int carportType;
    

    public Order( int id, int IDorder, int Width, int Length, int Height, boolean Shed, boolean Status) {
        this.id =id;
        this.IDorder = IDorder;
        this.Width = Width;
        this.Length = Length;
        this.Height = Height;
        this.Shed = Shed;
        this.Status = Status;
    }

    public boolean isStatus()
    {
        return Status;
    }

    public void setStatus(boolean Status)
    {
        this.Status = Status;
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

    public boolean isShed() {
        return Shed;
    }

    public void setShed(boolean Shed) {
        this.Shed = Shed;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    
//    @Override
//    public String toString()
//    {
//        return "Order{" + "date=" + date + ", IDorder=" + IDorder + ", Width=" + Width + ", Length=" + Length + ", Height=" + Height + ", Shed=" + Shed + ", Status=" + Status + '}';
//    }

    @Override
    public String toString()
    {
        return "Order{" + "date=" + date + ", User id=" + id + ", IDorder=" + IDorder + ", Width=" + Width + ", Length=" + Length + ", Height=" + Height + ", Shed=" + Shed + ", Status=" + Status + '}';
    }

    
    
    
    
        
}
