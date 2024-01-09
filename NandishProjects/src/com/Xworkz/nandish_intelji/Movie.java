package com.Xworkz.nandish_intelji;

import java.sql.SQLOutput;

public class Movie {
    public Movie(){
        System.out.println("Movie is created for public entertainment");
    }

    public void character(){
        System.out.println("Every character in the movie has its own importance");
    }

    protected void budget(){
        System.out.println("Every movie is done when the budget is clear");
    }

    void display(){
        System.out.println("Display running in Movie");
        mainRoles();
    }

    private void mainRoles(){
        System.out.println("Main role play an eminent role in attracting public");
    }
}
