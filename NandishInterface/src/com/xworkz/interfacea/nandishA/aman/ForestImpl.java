package com.xworkz.interfacea.nandishA.aman;

public class ForestImpl implements ForestRule {
    private String forestName;
    @Override
    public void forestCrime(String forestName) {
        this.forestName = forestName;
        System.out.println("Forest Name:"+forestName);
        System.out.println("Forest crimes must be controlled for securing wild lifes and earth");
    }

    @Override
    public void survivalanceZeep() {
        System.out.println("Very much required");
    }

    @Override
    public boolean cctvCamera() {
        System.out.println("Installed");
        return false;
    }

    @Override
    public void huntingPunishment() {
        System.out.println("10 years jail");
    }
}
