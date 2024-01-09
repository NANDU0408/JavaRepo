package com.Xworkz.nandish_intelji.equalsOperator;

public class GuiterRunning {
    public static void main(String[] nnn){
        Guiter guiter= new Guiter(1,500,"plasticCoatedWood");
        Guiter guiter1= new Guiter(1,400,"plasticCoatedWood");

        boolean man =guiter.equals(guiter1);

        WifiDongle wifiDongle= new WifiDongle("Airtel",100,250);
        WifiDongle wifiDongle1 = new WifiDongle("JIO", 100, 250);

        boolean man1 = wifiDongle.equals(wifiDongle1);

        UsbHub usbHub = new UsbHub(4,100, true);
        UsbHub usbHub1 = new UsbHub(5,100,true);

        boolean man2 = usbHub.equals(usbHub1);
    }
}
