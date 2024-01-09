package com.xworkz.interfacea.nandishA.boot;

import com.xworkz.interfacea.nandishA.aman.ForestRule;
import com.xworkz.interfacea.nandishA.aman.ForestImpl;

public class ForestRunner {
    public static void main(String[] args) {
        ForestRule forest = new ForestImpl();
        forest.forestCrime("Kalinga");
        forest.cctvCamera();
        forest.huntingPunishment();
        forest.survivalanceZeep();

        ForestImpl forest1 = new ForestImpl();
        forest1.forestCrime("Dandeli");
        forest1.cctvCamera();
        forest1.huntingPunishment();
        forest1.survivalanceZeep();
    }
}
