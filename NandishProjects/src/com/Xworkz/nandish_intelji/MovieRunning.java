package com.Xworkz.nandish_intelji;

import com.Xworkz.nandish_intelji.productionHouse.Production;

public class MovieRunning {
    public static void main(String... nnn){
        System.out.println("Starting main in MovieRunning");
        Movie movie = new Movie();
        movie.display();
        movie.character();
        movie.budget();

        Production production = new Production();
        production.budget();
        production.character();
        production.usage();

        MainRole mainRole = new MainRole();
        mainRole.display();
        mainRole.budget();
        mainRole.character();
        mainRole.displayInfo();
        System.out.println("Ending main in MovieRunning");
    }
}
