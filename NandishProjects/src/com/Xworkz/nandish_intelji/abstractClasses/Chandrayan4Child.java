package com.Xworkz.nandish_intelji.abstractClasses;

public class Chandrayan4Child extends Chandrayan4{
    @Override
    public void Rocket(String color, String name) {
        System.out.println("Chandrayan4Child:-Rocket is ready for launch");
    }

    @Override
    public void architecture(Boolean submitted, String architectName) {
        super.architecture(submitted, architectName);
        System.out.println("Chandrayan4Child:-BluePrint is ready");
    }
}
