package com.Xworkz.nandish_intelji.productionHouse;

import com.Xworkz.nandish_intelji.Movie;

public class Production extends Movie {

        public Production(){
            super.budget();
            System.out.println("Production plays an eminent role in movie making");
        }
        public void usage(){

            Movie movie=new Movie();
            movie.character();
            System.out.println("accessing only public as in diff package");
        }
    }