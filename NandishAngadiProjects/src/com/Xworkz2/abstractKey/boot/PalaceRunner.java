package com.Xworkz2.abstractKey.boot;

import com.Xworkz2.abstractKey.NandishA.MuseumPalace;
import com.Xworkz2.abstractKey.NandishA.Palace;

public class PalaceRunner {
    public static void main(String[] nnn){
        //Palace palace=new Palace("Mysore","Roy",1500);
        //System.out.println("The palace:"+palace);

        Palace palace1= new MuseumPalace("Jaipur","Harish", 1680);
        System.out.println("The palace:"+palace1);
        Palace palace = new MuseumPalace("Mysore",5000);
        System.out.println("Palace is in:"+palace);
        palace.drainage("Jay",true);
    }


}
