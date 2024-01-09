package com.xworkz.interfacea.nandishA.boot;

import com.xworkz.interfacea.nandishA.aman.TempleImpl;
import com.xworkz.interfacea.nandishA.aman.TempleRule;

public class TempleRunner {
    public static void main(String[] args) {
        TempleRule templeRule = new TempleImpl();
        templeRule.poojaRule("Vedvas","Padnabha");
        templeRule.parishudda();
        templeRule.poojaItems();
        templeRule.prasadTimeExecuted();

        TempleImpl temple = new TempleImpl();
        temple.poojaRule("Alok","VidhyaSaraswathi");
        temple.poojaItems();
        temple.prasadTimeExecuted();
        temple.parishudda();
    }
}
