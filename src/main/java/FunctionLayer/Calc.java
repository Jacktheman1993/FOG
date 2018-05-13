package FunctionLayer;

/*
    [0]Pillar
    [1]Roofplate400x100
    [2]Roofplate200x100
    [3]Rafter
    [4]Screw
 */
public class Calc {

    int pillars, roofplate400x100, roofplate200x100, rafter, screw;
    
public int[] styklisteReg (Order order, int width, int length, int height){
    int[] mats = new int[5];
    //et gæt på hvordan man kan udregne mængden af søm.
    //for hver plade der er får man 2 søm og 2 per stolpe/søjle og 2 per planke
    int rp400x100 = 0;
    int rp200x100 = 0;
    
    int[] rp = roofplateReg(width, length);
    
    rp400x100 = rp[0];
    rp200x100 = rp[1];
    
        mats[0] = pillarReg(width, length, height);
        mats[1] = rp400x100;
        mats[2] = rp200x100;
        mats[3] = rafterReg(width, length);
        mats[4] = screwReg(width, length, height);
    return mats;
    }


public int pillarReg(int width, int length, int height){
    //not using parameters yet.
    
    pillars = 4;
    System.out.println("pillar done");
    return pillars;
}
public int[] roofplateReg(int width, int length){
    int[] rpReg = new int[2];
    // sætter søjler til 4 da der skal være 4 i en carport
    
    //udregner hvor mange 400x100 tagplader der skal bruges. 
    while(width >= 400 && length >= 400){
        
        width -= 380;
        length -=380;
        
        roofplate400x100++;
    }
    
    //udregner hvor mange 200x100 tagplader der skal bruges.
    //HVIS DER MANGLER NOGET WIDTH OG LENGTH GIVER DEN EN EKSTRA!
    while(width > 20 && length > 20){
        
        width -= 180;
        length -= 180;
        
        roofplate200x100++;
    }
    rpReg[0] = roofplate400x100;
    rpReg[1] = roofplate200x100;
    System.out.println("rp done");
    return rpReg;
}



public int rafterReg(int width, int length){
        rafter = 0;
    while(width > 0){
        
        rafter++;
        
        width -= 70;
    }
    while(length > 0){
        
        rafter++;
        
        length -= 70;
    }
    System.out.println("rafter done");
    return rafter;
}

public int screwReg(int width, int length, int height){
    
    screw = 0;
    
    while(width > 0 || length > 0 || height > 0){
        width -= 100;
        length -= 100;
        height -= 100;
        
        screw += 75;
    }
    System.out.println("screw done");
    return screw;
}

}

