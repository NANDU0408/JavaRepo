package com.xworkz.interfacea.nandishA.aman;

public class TempleImpl implements TempleRule{
    private String chiefPoojariName;
    private  String TempleName;
    @Override
    public void poojaRule(String chiefPoojariName, String TempleName) {
        this.chiefPoojariName=chiefPoojariName;
        this.TempleName=TempleName;
        System.out.println("ChiefPoojariName:"+chiefPoojariName+ ",TempleName:"+TempleName);
        System.out.println("Rule is followed strictly");
    }

    @Override
    public boolean parishudda() {
        System.out.println("Yes");
        this.poojaItems();
        this.poojaRule("Rajan","Someshwara");
        this.poojaItems();
        this.prasadTimeExecuted();
        return false;
    }

    @Override
    public void prasadTimeExecuted() {
        System.out.println("Alloted");
    }

    @Override
    public void poojaItems() {
        System.out.println("Verified");
    }
}
