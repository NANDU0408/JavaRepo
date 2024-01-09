package com.xworkz.interfacea.nandishA.cloneBoot;

import com.xworkz.interfacea.nandishA.clone.Candle;
import com.xworkz.interfacea.nandishA.clone.Light;
import com.xworkz.interfacea.nandishA.clone.Paint;
import com.xworkz.interfacea.nandishA.clone.Plastic;

public class AllOtherRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println();
        System.out.println("Plastic");
        Plastic plastic = new Plastic("PETE","Viker",6,4);
        System.out.println(plastic);
        Plastic ref= plastic.clone();
        System.out.println("Clone of "+ref);
        System.out.println();

        System.out.println();
        System.out.println("Light");
        Light light = new Light("Harsha","JESCOM",80,8);
        System.out.println(light);
        Light ref1= light.clone();
        System.out.println("Clone of "+ref1);

        System.out.println();
        System.out.println("Candle");
        Candle candle = new Candle("Vikas","Angel",10,15);
        System.out.println(candle);
        Candle ref2 = candle.clone();
        System.out.println("Clone of "+ref2);

        System.out.println();
        System.out.println("Paint");
        Paint paint = new Paint("Asian","Sham Paints",20,15000);
        System.out.println(paint);
        Paint ref3 = paint.clone();
        System.out.println("Clone of "+ref3);
    }
}
