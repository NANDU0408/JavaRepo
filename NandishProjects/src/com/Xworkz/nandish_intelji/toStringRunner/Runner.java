package com.Xworkz.nandish_intelji.toStringRunner;

import com.Xworkz.nandish_intelji.toString.*;

public class Runner {
    public static void main(String[] nnn){
        System.out.println("Starting main in Runner");
        Lens lens = new Lens();
        lens.displayLens(5,"shortSighted","Lenskart",2500);
        String ref = lens.toString();
        System.out.println(ref);
        System.out.println("hash code is:"+lens.hashCode());
        System.out.println("original hash code is:"+System.identityHashCode(lens));

        Lens lens1 = new Lens();
        lens1.displayLens(3,"longSighted","Calvin Klein",2800);
        String ref1= lens1.toString();
        System.out.println(ref1);

        Locker locker = new Locker();
        locker.displayLocker(567841,"Godrej","SafeLocker",28000);
        String ref2= locker.toString();
        System.out.println(ref2);

        Locker locker1 = new Locker();
        locker1.displayLocker(586847,"Yale Standard","BankLocker",285000);
        String ref3= locker1.toString();
        System.out.println(ref3);

        Cotton cotton = new Cotton();
        cotton.displayCotton(58,"Medical","Bangalore",5000);
        String ref4= cotton.toString();
        System.out.println(ref4);

        Cotton cotton1 = new Cotton();
        cotton1.displayCotton(500,"Factory","Pune",50000);
        String ref5= cotton1.toString();
        System.out.println(ref5);

        Mic mic = new Mic();
        mic.displayMic("singing","Shure",2,15000);
        String ref6= mic.toString();
        System.out.println(ref6);

        Mic mic1 = new Mic();
        mic1.displayMic("speakerMic","Sennheiser",4,25000);
        String ref7= mic1.toString();
        System.out.println(ref7);

        Heart heart = new Heart();
        heart.displayHeart("normal","bloodPumping",2,2);
        String ref8= heart.toString();
        System.out.println(ref8);

        Heart heart1 = new Heart();
        heart1.displayHeart("abnormal","artificialBloodPumping",1,1);
        String ref9= heart1.toString();
        System.out.println(ref9);

        Seed seed = new Seed();
        seed.displaySeed("normal","brown",1,500);
        String ref10= seed.toString();
        System.out.println(ref10);

        Seed seed1= new Seed();
        seed1.displaySeed("normal","yellow",2,350);
        String ref11= seed1.toString();
        System.out.println(ref11);

        Chain chain= new Chain();
        chain.displayChain("platinum","Joyalukkas",5,35000);
        String ref12= chain.toString();
        System.out.println(ref12);

        Chain chain1= new Chain();
        chain1.displayChain("gold","Artica",8,47000);
        String ref13= chain1.toString();
        System.out.println(ref13);

        Rice rice= new Rice();
        rice.displayRice("Basmathi","cold",80,28000);
        String ref14= rice.toString();
        System.out.println(ref14);

        Rice rice1= new Rice();
        rice.displayRice("Masuri","normal",110,39000);
        String ref15= rice1.toString();
        System.out.println(ref15);

        Bowl bowl= new Bowl();
        bowl.displayBowl("Fiber","soup",15,50);
        String ref16= bowl.toString();
        System.out.println(ref16);

        Bowl bowl1= new Bowl();
        bowl.displayBowl("silver","sweet",10,4000);
        String ref17= bowl1.toString();
        System.out.println(ref17);

        Basket basket= new Basket();
        basket.displayBasket("Fiber","vegetables",25,250);
        String ref18= basket.toString();
        System.out.println(ref18);

        Basket basket1= new Basket();
        basket1.displayBasket("Plastic","eatables",11,5);
        String ref19= basket1.toString();
        System.out.println(ref19);

        Bucket bucket= new Bucket();
        bucket.displayBucket("Fiber","Bathing",30,350);
        String ref20= bucket.toString();
        System.out.println(ref20);

        Bucket bucket1= new Bucket();
        bucket1.displayBucket("Plastic","Dustbin",22,300);
        String ref21= bucket1.toString();
        System.out.println(ref21);

        Gyser gyser= new Gyser();
        gyser.displayGyser("Gas","Prestige",22,3000);
        String ref22= gyser.toString();
        System.out.println(ref22);

        Gyser gyser1= new Gyser();
        gyser1.displayGyser("Electric","VGaurd",28,5000);
        String ref23= gyser1.toString();
        System.out.println(ref23);

        Spoon spoon= new Spoon();
        spoon.displaySpoon("Silver","Eating",8,5500);
        String ref24= spoon.toString();
        System.out.println(ref24);

        Spoon spoon1= new Spoon();
        spoon1.displaySpoon("Steel","Serving",15,550);
        String ref25= spoon1.toString();
        System.out.println(ref25);

        Bandli bandli= new Bandli();
        bandli.displayBandli("Aluminium","MakingCurry",30,750);
        String ref26= bandli.toString();
        System.out.println(ref26);

        Bandli bandli1= new Bandli();
        bandli1.displayBandli("Steel","MakingRice",22,450);
        String ref27= bandli1.toString();
        System.out.println(ref27);

        Money money= new Money();
        money.displayMoney("Rupees","Good",8,8);
        String ref28= money.toString();
        System.out.println(ref28);

        Money money1= new Money();
        money1.displayMoney("Dollar","Bad",7,4);
        String ref29= money1.toString();
        System.out.println(ref29);
        
        System.out.println("Ending main in Runner");
    }
}
