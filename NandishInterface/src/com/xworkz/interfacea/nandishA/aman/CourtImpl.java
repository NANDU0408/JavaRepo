package com.xworkz.interfacea.nandishA.aman;

public class CourtImpl implements CourtRule {

    private String controller;
    private boolean executed;
    private String head;

    @Override
    public boolean rulesFollowed(String controller, boolean executed) {
        this.controller=controller;
        this.executed=executed;
        System.out.println("ControllerName:"+controller+",RulesExecuted:"+executed);
        System.out.println("Rules are followed");
        return false;
    }

    @Override
    public void courtRules(String head) {
        this.head=head;
        System.out.println("Court rules are made for neat execution of court works");
        System.out.println("Rules dept Head:"+head);
    }

    @Override
    public void ipcSectionExecuted() {
        System.out.println("Executed");
    }

    @Override
    public void judicialOffice() {
        System.out.println("Located inside the civil court");
    }
}
