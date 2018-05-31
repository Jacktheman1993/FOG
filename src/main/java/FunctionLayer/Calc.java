package FunctionLayer;

import java.util.ArrayList;
import java.util.Collections;



/**
 * This is all the methods that calculates the lineitems for a carport. 
 * @author simon
 */

public class Calc {

    /**
     * @param width
     * @return LineItems(1, quantity); 
    **/
    public LineItems calcUnderSternbrædderForBag(int width){
        int quantity = 0;
        
        width += width * 2;
        quantity = width/360;
        quantity += (width % 360 >= 360 ? + 1 : 0);
        
        LineItems li = new LineItems(1, quantity);
        return li;
    }

    /**
     *
     * @param length
     * @return LineItems(2, quantity);
     */
    public LineItems calcUnderSternbrædderSide(int length){
        int quantity = 0;
        length += length * 2;
        quantity = length/540;
        quantity += (length % 540 >= 540 ? + 1 : 0);
        
        LineItems li = new LineItems(2, quantity);
        return li;
    }
    
    /**
     *
     * @param width
     * @return LineItems(3, quantity);
     */
    public LineItems calcOverSternbrædderForenden(int width){
            int quantity = 0;
            quantity = width / 360;
            quantity += (width % 360 >= 360 ? + 1 : 0);
            
        LineItems li = new LineItems(3, quantity);
        return li;            
        }

    /**
     *
     * @param length
     * @return LineItems(4, quantity);
     */
    public LineItems calcOverSternbrædderSiderne(int length){
            int quantity = 0;
            length += length * 2;
            quantity = length / 360;
            quantity += (length % 360 >= 360 ? + 1 : 0);
            
        LineItems li = new LineItems(4, quantity);
        return li;            
            
            
        }

    /**
     *
     * @param width
     * @return LineItems(5, quantity);
     */
    public LineItems calcRemmeISider(int width){
            int quantity = 0;
            width += width * 2;
            quantity = width / 600;
            quantity += (width % 600 >= 600 ? + 1 : 0);
            
        LineItems li = new LineItems(5, quantity);
        return li;            
        }

    /**
     *
     * @param width
     * @return LineItems(6, quantity);
     */
    public LineItems calcSpærMontPåRem(int width){
            int quantity = 0;
            width += width * 2;
            quantity = width / 600;
            quantity += (width % 600 >= 600 ? + 1 : 0);
            quantity += quantity * 15;
                    
            LineItems li = new LineItems(6, quantity);
            return li;
        }

    /**
     *
     * @return LineItems(7, quantity);
     */
    public LineItems calcStolper(){
            int quantity = 0;
            quantity += 6;
                    
        LineItems li = new LineItems(7, quantity);
        return li;            
        }
        
    /**
     *
     * @param length
     * @return LineItems(8, quantity);
     */
    public LineItems calcVandbrædtSternSider(int length){
            int quantity = 0;
            length += length * 2;
            quantity = length / 540;
            quantity += (length % 540 >= 540 ? + 1 : 0);
                    
        LineItems li = new LineItems(8, quantity);
        return li;            
        }
        
    /**
     *
     * @param width
     * @return LineItems(9, quantity);
     */
    public LineItems calcVandbrædtSternForende(int width){
            int quantity = 0;
            quantity = width / 360;
            quantity += (width % 360 >= 360 ? + 1 : 0);
                    
        LineItems li = new LineItems(9, quantity);
        return li;
        }
        
    /**
     *
     * @param width
     * @return LineItems(10, quantity);
     */
    public LineItems calcTagpladerMontPåSpær600(int width){
            int quantity = 0;
            quantity = width / 100;
            quantity += (width % 100 >= 100 ? + 1 : 0);
                    
        LineItems li = new LineItems(10, quantity);
        return li;
        }
        
    /**
     *
     * @param width
     * @return LineItems(11, quantity);
     */
    public LineItems calcTagpladerMontPåSpær360(int width){
            int quantity = 0;
            quantity = width / 100;
            quantity += (width % 100 >= 100 ? + 1 : 0);
                    
        LineItems li = new LineItems(11, quantity);
        return li;        
        }
        
    /**
     *
     * @param width
     * @param length
     * @return LineItems(12, quantity);
     */
    public LineItems calcBundskruerPakke(int width, int length){
            int quantity = 0;
            length = length / 100;
            width = width / 100;
            quantity = length * width;
            quantity = quantity / 10;
        LineItems li = new LineItems(12, quantity);
        return li;
        }
        
    /**
     *
     * @param length
     * @return LineItems(13, quantity);
     */
    public LineItems calcHulbånd(int length){
            int quantity = 1;
            while (length > 10){
                quantity++;
                length -= 1000;
            }
            quantity = quantity * 2;
                    
        LineItems li = new LineItems(13, quantity);
        return li;
        }
        
    /**
     *
     * @param width
     * @return LineItems(14, quantity);
     */
    public LineItems calcSpærpåRemUniversalHøjre(int width){
            int quantity = 0;
            width += width * 2;
            quantity = width / 600;
            quantity += (width % 600 >= 600 ? + 1 : 0);
            quantity += quantity * 15;
                    
        LineItems li = new LineItems(14, quantity);
        return li;
        }
        
    /**
     *
     * @param width
     * @return LineItems(15, quantity);
     */
    public LineItems calcSpærpåRemUniversalVenstre(int width){
            int quantity = 0;
            width += width * 2;
            quantity = width / 600;
            quantity += (width % 600 >= 600 ? + 1 : 0);
            quantity += quantity * 15;
                    
        LineItems li = new LineItems(15, quantity);
        return li;
            
        }
        
    /**
     *
     * @param length
     * @return LineItems(16, quantity);
     */
    public LineItems calc4dot5x60Skruer(int length){
            int quantity = 0;
            while (length > 10){
                quantity++;
                length -= 1000;
            }
                    
        LineItems li = new LineItems(16, quantity);
        return li;
        }
        
    /**
     *
     * @param length
     * @return LineItems(17, quantity);
     */
    public LineItems calc4x50BesSkruer(int length){
            int quantity = 1;
            while (length > 10){
                quantity++;
                length -= 250;
            }
                    
        LineItems li = new LineItems(17, quantity);
        return li;        
        }
        
    /**
     *
     * @param length
     * @return LineItems(18, quantity);
     */
    public LineItems calcBræddeBolt(int length){
            int quantity = 1;
            while (length > 10){
                quantity++;
                length -= 90;
            }
            quantity = quantity * 2;
                    
        LineItems li = new LineItems(18, quantity);
        return li;    
        
        }
        
    /**
     *
     * @param length
     * @return LineItems(19, quantity);
     */
    public LineItems calcFirkantsskiver(int length){
            int quantity = 1;
            while (length > 10){
                quantity++;
                length -= 100;
            }
            quantity = quantity * 2;
                    
        LineItems li = new LineItems(19, quantity);
        return li;
        
        }
        
    /**
     *
     * @param length
     * @return LineItems(20, quantity);
     */
    public LineItems calc4dot5x70(int length){
            int quantity = 0;
            while (length > 10){
                quantity++;
                length -= 1000;
            }
            quantity = quantity * 2;
                    
        LineItems li = new LineItems(20, quantity);
        return li;
        
        }
        
    /**
     *
     * @param length
     * @return LineItems(21, quantity);
     */
    public LineItems calc4dot5x50(int length){
            int quantity = 0;
            while (length > 10){
                quantity++;
                length -= 1000;
            }
            quantity = quantity * 2;
                    
        LineItems li = new LineItems(21, quantity);
        return li;
        
        }
        
        
        
        
         //Shed Calculator. 

    /**
     *
     * @param length
     * @return LineItems(22, quantity);
     */
        
        public LineItems calcVinkelBeslag(int length){
            int quantity = 0;
            while (length > 10){
                quantity++;
                length -= 20;
            }
                    
        LineItems li = new LineItems(22, quantity);
        return li;
        
        }
        
    /**
     *
     * @return LineItems(23, quantity);
     */
    public LineItems calcLægteBagsideDør(){
            int quantity = 0;
            
            quantity++;
            
            return new LineItems(23, quantity);
            
        }
       
    /**
     *
     * @param width
     * @return LineItems(24, quantity);
     */
    public LineItems calcLøsholtSkurSider(int width){
            int quantity = 0;
            
            while(width >=600)
            {
                width -= 600;
                
                quantity += 4;    
            }
            while(width >= 1)
            {
                width -= 600;
                
                quantity += 2;
            }
            
            return new LineItems(24, quantity);
            
        }
        
    /**
     *
     * @return LineItems(25, quantity);
     */
    public LineItems calcStaldDørsGreb(){
            int quantity = 1;
            
            
            return new LineItems(25, quantity);
        }
        
    /**
     *
     * @return LineItems(26, quantity);
     */
    public LineItems calcHængsler(){
            int quantity = 2;
            
            
            return new LineItems(26, quantity);
        }
       
         
         //runs all methods and returns an ArrayList

    /**
     *
     * @param width
     * @param length
     * @param height
     * @return Adds all LineItems to an ArrayList, sorted by id, then returns the list.
     */
         
         public ArrayList<LineItems> calcAllShed(int width, int length, int height){
            ArrayList<LineItems> listwithall = new ArrayList<>();
            SortLineItems quicksort = new SortLineItems();
            
            listwithall.add(calc4dot5x50(length));
            listwithall.add(calc4dot5x70(length));
            listwithall.add(calc4dot5x60Skruer(length));
            listwithall.add(calc4x50BesSkruer(length));
            listwithall.add(calcBræddeBolt(length));
            listwithall.add(calcBundskruerPakke(width, length));
            listwithall.add(calcFirkantsskiver(length));
            listwithall.add(calcHulbånd(length));
            listwithall.add(calcOverSternbrædderForenden(width));
            listwithall.add(calcOverSternbrædderSiderne(length));
            listwithall.add(calcRemmeISider(width));
            listwithall.add(calcSpærMontPåRem(width));
            listwithall.add(calcSpærpåRemUniversalHøjre(width));
            listwithall.add(calcSpærpåRemUniversalVenstre(width));
            listwithall.add(calcStolper());
            listwithall.add(calcTagpladerMontPåSpær360(width));
            listwithall.add(calcTagpladerMontPåSpær600(width));
            listwithall.add(calcUnderSternbrædderForBag(width));
            listwithall.add(calcUnderSternbrædderSide(length));
            listwithall.add(calcVandbrædtSternForende(width));
            listwithall.add(calcVandbrædtSternSider(length));
            
            listwithall.add(calcVinkelBeslag(length));
            listwithall.add(calcLægteBagsideDør());
            listwithall.add(calcLøsholtSkurSider(width));
            listwithall.add(calcStaldDørsGreb());
            listwithall.add(calcHængsler());
            
            quicksort.quickSorting(listwithall, 0, listwithall.size() - 1);
            
            return listwithall;
        }
         
         

    /**
     *
     * @param width
     * @param length
     * @param height
     * @return Adds all LineItems to an ArrayList, sorted by id, then returns the list.
     */
         
        public ArrayList<LineItems> calcAllNoShed(int width, int length, int height){
            ArrayList<LineItems> listwithall = new ArrayList<>();
            SortLineItems quicksort = new SortLineItems();
            
            listwithall.add(calc4dot5x50(length));
            listwithall.add(calc4dot5x70(length));
            listwithall.add(calc4dot5x60Skruer(length));
            listwithall.add(calc4x50BesSkruer(length));
            listwithall.add(calcBræddeBolt(length));
            listwithall.add(calcBundskruerPakke(width, length));
            listwithall.add(calcFirkantsskiver(length));
            listwithall.add(calcHulbånd(length));
            listwithall.add(calcOverSternbrædderForenden(width));
            listwithall.add(calcOverSternbrædderSiderne(length));
            listwithall.add(calcRemmeISider(width));
            listwithall.add(calcSpærMontPåRem(width));
            listwithall.add(calcSpærpåRemUniversalHøjre(width));
            listwithall.add(calcSpærpåRemUniversalVenstre(width));
            listwithall.add(calcStolper());
            listwithall.add(calcTagpladerMontPåSpær360(width));
            listwithall.add(calcTagpladerMontPåSpær600(width));
            listwithall.add(calcUnderSternbrædderForBag(width));
            listwithall.add(calcUnderSternbrædderSide(length));
            listwithall.add(calcVandbrædtSternForende(width));
            listwithall.add(calcVandbrædtSternSider(length));
            
            quicksort.quickSorting(listwithall, 0, listwithall.size() - 1);            
            
            return listwithall;
        }

}
