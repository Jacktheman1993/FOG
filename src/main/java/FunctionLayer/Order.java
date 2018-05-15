/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.Date;
import java.util.ArrayList;
//import java.util.Calendar;
/**
 *
 * @author Martin
 */
public class Order
{
//    private java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
    private int IDorder;
    private int width;
    private int length;
    private int height;
    private ArrayList<LineItems> lineItems;
    
    // boolean skur;
    // int carportType;
    

    public Order(int IDorder, int width, int length, int height, ArrayList<LineItems> lineItems) {
        this.IDorder = IDorder;
        this.width = width;
        this.length = length;
        this.height = height;
        this.lineItems = lineItems;
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
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public ArrayList getLineItems() {
        return lineItems;
    }

    public void setLineItems(ArrayList lineItems) {
        this.lineItems = lineItems;
    }

    @Override
    public String toString() {
        return "Order{" + "IDorder=" + IDorder + ", width=" + width + ", length=" + length + ", height=" + height + ", lineItems=" + lineItems + '}';
    }

    public void calcUnderSternbrædderForBag(int width){
        int quantity = 0;
        width += width * 2;
        quantity = width/360;
        quantity += (width % 360 >= 360 ? + 1 : 0);
        
        //length på 360
        lineItems.add(new LineItems(quantity, 1));
    }

        public void calcUnderSternbrædderSide(int length){
        int quantity = 0;
        length += length * 2;
        quantity = length/540;
        quantity += (length % 540 >= 540 ? + 1 : 0);
        
        //length på 540
        lineItems.add(new LineItems(quantity, 2));
    }
    
        public void calcOverSternbrædderForenden(int width){
            int quantity = 0;
            quantity = width / 360;
            quantity += (width % 360 >= 360 ? + 1 : 0);
            
            //length på 360
            lineItems.add(new LineItems(quantity, 3));
            
        }
        public void calcOverSternbrædderSiderne(int length){
            int quantity = 0;
            length += length * 2;
            quantity = length / 360;
            quantity += (length % 360 >= 360 ? + 1 : 0);
            
            //length på 360
            lineItems.add(new LineItems(quantity, 4));
            
            
            
        }
       /* 
        public void calcLægteBagsideDør(int width){
            int quantity = 0;
            quantity = width / 360;
            quantity += (width % 360 >= 360 ? + 1 : 0);
            
            //length på 360
            lineItems.add(new LineItems(quantity, 3));
            
        }*/
        
        /*public void calcLøsholterSkurGalve(int width){
            int quantity = 0;
            quantity = width / 360;
            quantity += (width % 360 >= 360 ? + 1 : 0);
            
            //length på 360
            lineItems.add(new LineItems(quantity, 3));
            
        }*/
        
        /*public void calcLøsholtSkurSider(int width){
            int quantity = 0;
            quantity = width / 360;
            quantity += (width % 360 >= 360 ? + 1 : 0);
            
            //length på 360
            lineItems.add(new LineItems(quantity, 3));
            
        }*/
        public void calcRemmeISider(int width){
            int quantity = 0;
            width += width * 2;
            quantity = width / 600;
            quantity += (width % 600 >= 600 ? + 1 : 0);
            
            //length på 600
            lineItems.add(new LineItems(quantity, 5));
            
        }
        public void calcSpærMontPåRem(int width){
            int quantity = 0;
            width += width * 2;
            quantity = width / 600;
            quantity += (width % 600 >= 600 ? + 1 : 0);
            quantity += quantity * 15;
                    
            //length på 360
            lineItems.add(new LineItems(quantity, 6));
            
        }
        public void calcStolper(){
            int quantity = 0;
            quantity += 6;
                    
            //length på 300
            lineItems.add(new LineItems(quantity, 7));
            
        }
        
        public void calcVandbrædtSternSider(int length){
            int quantity = 0;
            length += length * 2;
            quantity = length / 540;
            quantity += (length % 540 >= 540 ? + 1 : 0);
                    
            //length på 360
            lineItems.add(new LineItems(quantity, 8));
            
        }
        
        public void calcVandbrædtSternForende(int width){
            int quantity = 0;
            quantity = width / 360;
            quantity += (width % 360 >= 360 ? + 1 : 0);
                    
            //length på 360
            lineItems.add(new LineItems(quantity, 9));
        }
        
        //tagplader er svær at udregne, i tvivl om udregning.
        public void calcTagpladerMontPåSpær600(int width){
            int quantity = 0;
            quantity = length / 100;
            quantity += (length % 100 >= 100 ? + 1 : 0);
                    
            //length på 600
            lineItems.add(new LineItems(quantity, 10));
        
        }
        
        public void calcTagpladerMontPåSpær360(int width){
            int quantity = 0;
            //der bliver brugt lige mange 600 og 360 plader
            quantity = width / 100;
            quantity += (width % 100 >= 100 ? + 1 : 0);
                    
            lineItems.add(new LineItems(quantity, 11));
        
        }
        
        
        public void calcBundskruerPakke(int width, int length){
            int quantity = 0;
            length = length / 100;
            width = width / 100;
            quantity = length * width;
            //length på 600
            lineItems.add(new LineItems(quantity, 12));
        
        }
        
        public void calcHulbånd(int length){
            int quantity = 1;
            while (length > 10){
                quantity++;
                length -= 10;
            }
            quantity = quantity * 2;
                    
            //length på 600
            lineItems.add(new LineItems(quantity, 13));
        
        }
        
        public void calcSpærpåRemUniversalHøjre(int width){
            int quantity = 0;
            width += width * 2;
            quantity = width / 600;
            quantity += (width % 600 >= 600 ? + 1 : 0);
            quantity += quantity * 15;
                    
            //length på 360
            lineItems.add(new LineItems(quantity, 14));
            
        }
        
        public void calcSpærpåRemUniversalVenstre(int width){
            int quantity = 0;
            width += width * 2;
            quantity = width / 600;
            quantity += (width % 600 >= 600 ? + 1 : 0);
            quantity += quantity * 15;
                    
            //length på 360
            lineItems.add(new LineItems(quantity, 15));
            
        }
        
        public void calc4dot5x60Skruer(int length){
            int quantity = 1;
            while (length > 10){
                quantity++;
                length -= 10;
            }
            quantity = quantity * 2;
                    
            lineItems.add(new LineItems(quantity, 16));
        
        }
        
        public void calc4x50BesSkruer(int length){
            int quantity = 1;
            while (length > 10){
                quantity++;
                length -= 10;
            }
            quantity = quantity * 3;
                    
            //length på 600
            lineItems.add(new LineItems(quantity, 17));
        
        }
        
        public void calcBræddeBolt(int length){
            int quantity = 1;
            while (length > 10){
                quantity++;
                length -= 10;
            }
            quantity = quantity * 18;
                    
            //length på 600
            lineItems.add(new LineItems(quantity, 18));
        
        }
        
        public void calcFirkantsskiver(int length){
            int quantity = 1;
            while (length > 10){
                quantity++;
                length -= 10;
            }
            quantity = quantity * 12;
                    
            //length på 600
            lineItems.add(new LineItems(quantity, 19));
        
        }
        
        public void calc4dot5x70(int length){
            int quantity = 1;
            while (length > 10){
                quantity++;
                length -= 10;
            }
            quantity = quantity * 2;
                    
            //length på 600
            lineItems.add(new LineItems(quantity, 20));
        
        }
        
        public void calc4dot5x50(int length){
            int quantity = 1;
            while (length > 10){
                quantity++;
                length -= 10;
            }
            quantity = quantity * 2;
                    
            //length på 600
            lineItems.add(new LineItems(quantity, 21));
        
        }
        
        public void calcVinkelBeslag(int length){
            int quantity = 1;
            while (length > 10){
                quantity++;
                length -= 10;
            }
            quantity = quantity * 40;
                    
            //length på 600
            lineItems.add(new LineItems(quantity, 22));
        
        }
        
        public ArrayList<LineItems> calcAll(int width, int length, int height){
            ArrayList<LineItems> listwithall = new ArrayList<>();
            
            calc4dot5x50(length);
            calc4dot5x70(length);
            calc4dot5x60Skruer(length);
            calc4x50BesSkruer(length);
            calcBræddeBolt(length);
            calcBundskruerPakke(width, length);
            calcFirkantsskiver(length);
            calcHulbånd(length);
            calcOverSternbrædderForenden(width);
            calcOverSternbrædderSiderne(length);
            calcRemmeISider(width);
            calcSpærMontPåRem(width);
            calcSpærpåRemUniversalHøjre(width);
            calcSpærpåRemUniversalVenstre(width);
            calcStolper();
            calcTagpladerMontPåSpær360(width);
            calcTagpladerMontPåSpær600(width);
            calcUnderSternbrædderForBag(width);
            calcUnderSternbrædderSide(length);
            calcVandbrædtSternForende(width);
            calcVandbrædtSternSider(length);
            calcVinkelBeslag(length);
            
            return null;
        }
}
