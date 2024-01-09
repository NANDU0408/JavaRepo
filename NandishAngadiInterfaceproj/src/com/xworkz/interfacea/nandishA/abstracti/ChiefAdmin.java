package com.xworkz.interfacea.nandishA.abstracti;

public class ChiefAdmin {
    AirPortRule airPortRule;
  public ChiefAdmin(AirPortRule airPortRule){
      this.airPortRule= airPortRule;
  }
  public void check(){
      String checkID = airPortRule.checkID();
      boolean rulesObeyed = airPortRule.rulesObeyed();
      if (rulesObeyed && checkID!=null){
          System.out.println("CheckIN Completed");
      }
      else {
          System.err.println("Cannot travel");
      }
  }
}
