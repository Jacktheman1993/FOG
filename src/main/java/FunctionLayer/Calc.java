package FunctionLayer;

import DBAccess.LineItemMapper;
import java.util.ArrayList;

//Simon

public class Calc {

    
 

    public LineItems calcUnderSternbrædderForBag(int width){
        int quantity = 0;
        
        width += width * 2;
        quantity = width/360;
        quantity += (width % 360 >= 360 ? + 1 : 0);
        
        //length på 360
        LineItems li = new LineItems(1, quantity);
        return li;
    }

        public LineItems calcUnderSternbrædderSide(int length){
        int quantity = 0;
        length += length * 2;
        quantity = length/540;
        quantity += (length % 540 >= 540 ? + 1 : 0);
        
        //length på 540
        LineItems li = new LineItems(2, quantity);
        return li;
    }
    
        public LineItems calcOverSternbrædderForenden(int width){
            int quantity = 0;
            quantity = width / 360;
            quantity += (width % 360 >= 360 ? + 1 : 0);
            
          //  length på 360
        LineItems li = new LineItems(3, quantity);
        return li;            
        }
        public LineItems calcOverSternbrædderSiderne(int length){
            int quantity = 0;
            length += length * 2;
            quantity = length / 360;
            quantity += (length % 360 >= 360 ? + 1 : 0);
            
            //length på 360
        LineItems li = new LineItems(4, quantity);
        return li;            
            
            
        }

        public LineItems calcRemmeISider(int width){
            int quantity = 0;
            width += width * 2;
            quantity = width / 600;
            quantity += (width % 600 >= 600 ? + 1 : 0);
            
            //length på 600
        LineItems li = new LineItems(5, quantity);
        return li;            
        }
        public LineItems calcSpærMontPåRem(int width){
            int quantity = 0;
            width += width * 2;
            quantity = width / 600;
            quantity += (width % 600 >= 600 ? + 1 : 0);
            quantity += quantity * 15;
                    
            //length på 360
            LineItems li = new LineItems(6, quantity);
            return li;
        }
        public LineItems calcStolper(){
            int quantity = 0;
            quantity += 6;
                    
            //length på 300
        LineItems li = new LineItems(7, quantity);
        return li;            
        }
        
        public LineItems calcVandbrædtSternSider(int length){
            int quantity = 0;
            length += length * 2;
            quantity = length / 540;
            quantity += (length % 540 >= 540 ? + 1 : 0);
                    
            //length på 360
        LineItems li = new LineItems(8, quantity);
        return li;            
        }
        
        public LineItems calcVandbrædtSternForende(int width){
            int quantity = 0;
            quantity = width / 360;
            quantity += (width % 360 >= 360 ? + 1 : 0);
                    
            //length på 360
        LineItems li = new LineItems(9, quantity);
        return li;
        }
        
        //tagplader er svær at udregne, i tvivl om udregning.
        public LineItems calcTagpladerMontPåSpær600(int width){
            int quantity = 0;
            quantity = width / 100;
            quantity += (width % 100 >= 100 ? + 1 : 0);
                    
            //length på 600
        LineItems li = new LineItems(10, quantity);
        return li;
        }
        
        public LineItems calcTagpladerMontPåSpær360(int width){
            int quantity = 0;
            //der bliver brugt lige mange 600 og 360 plader
            quantity = width / 100;
            quantity += (width % 100 >= 100 ? + 1 : 0);
                    
        LineItems li = new LineItems(11, quantity);
        return li;        
        }
        
        
        public LineItems calcBundskruerPakke(int width, int length){
            int quantity = 0;
            length = length / 100;
            width = width / 100;
            quantity = length * width;
            //length på 600
        LineItems li = new LineItems(12, quantity);
        return li;
        }
        
        public LineItems calcHulbånd(int length){
            int quantity = 1;
            while (length > 10){
                quantity++;
                length -= 10;
            }
            quantity = quantity * 2;
                    
            //length på 600
        LineItems li = new LineItems(13, quantity);
        return li;
        }
        
        public LineItems calcSpærpåRemUniversalHøjre(int width){
            int quantity = 0;
            width += width * 2;
            quantity = width / 600;
            quantity += (width % 600 >= 600 ? + 1 : 0);
            quantity += quantity * 15;
                    
            //length på 360
        LineItems li = new LineItems(14, quantity);
        return li;
        }
        
        public LineItems calcSpærpåRemUniversalVenstre(int width){
            int quantity = 0;
            width += width * 2;
            quantity = width / 600;
            quantity += (width % 600 >= 600 ? + 1 : 0);
            quantity += quantity * 15;
                    
            //length på 360
        LineItems li = new LineItems(15, quantity);
        return li;
            
        }
        
        public LineItems calc4dot5x60Skruer(int length){
            int quantity = 1;
            while (length > 10){
                quantity++;
                length -= 10;
            }
            quantity = quantity * 2;
                    
        LineItems li = new LineItems(16, quantity);
        return li;
        }
        
        public LineItems calc4x50BesSkruer(int length){
            int quantity = 1;
            while (length > 10){
                quantity++;
                length -= 10;
            }
            quantity = quantity * 3;
                    
            //length på 600
        LineItems li = new LineItems(17, quantity);
        return li;        
        }
        
        public LineItems calcBræddeBolt(int length){
            int quantity = 1;
            while (length > 10){
                quantity++;
                length -= 10;
            }
            quantity = quantity * 18;
                    
            //length på 600
        LineItems li = new LineItems(18, quantity);
        return li;    
        
        }
        
        public LineItems calcFirkantsskiver(int length){
            int quantity = 1;
            while (length > 10){
                quantity++;
                length -= 10;
            }
            quantity = quantity * 12;
                    
            //length på 600
        LineItems li = new LineItems(19, quantity);
        return li;
        
        }
        
        public LineItems calc4dot5x70(int length){
            int quantity = 1;
            while (length > 10){
                quantity++;
                length -= 10;
            }
            quantity = quantity * 2;
                    
            //length på 600
        LineItems li = new LineItems(20, quantity);
        return li;
        
        }
        
        public LineItems calc4dot5x50(int length){
            int quantity = 1;
            while (length > 10){
                quantity++;
                length -= 10;
            }
            quantity = quantity * 2;
                    
            //length på 600
        LineItems li = new LineItems(21, quantity);
        return li;
        
        }
        
        public LineItems calcVinkelBeslag(int length){
            int quantity = 1;
            while (length > 10){
                quantity++;
                length -= 10;
            }
            quantity = quantity * 40;
                    
            //length på 600
        LineItems li = new LineItems(22, quantity);
        return li;
        
        }
        
        
        //Shed Calculator. All sheds are the same
        
                
        public LineItems calcLægteBagsideDør(){
            int quantity = 0;
            
            quantity++;
            
            return new LineItems(23, quantity);
            
        }
       /* 
        public void calcLøsholterSkurGalve(int width){
            int quantity = 0;
            quantity = width / 360;
            quantity += (width % 360 >= 360 ? + 1 : 0);
            
            length på 360
            lineItems.add(new LineItems(quantity, 3));
            
        }
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
        
        public LineItems calcStaldDørsGreb(){
            int quantity = 1;
            
            
            return new LineItems(25, quantity);
        }
        
         public LineItems calcHængsler(){
            int quantity = 2;
            
            
            return new LineItems(26, quantity);
        }
        
         public ArrayList<LineItems> calcAllShed(int width, int length, int height){
            ArrayList<LineItems> listwithall = new ArrayList<>();
            
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
            
            
            return listwithall;
        }
         
        public ArrayList<LineItems> calcAllNoShed(int width, int length, int height){
            ArrayList<LineItems> listwithall = new ArrayList<>();
            
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
            
            
            return listwithall;
        }

}
