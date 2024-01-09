package com.Xworkz.nandish_intelji.equalsOperator;

public class UsbHub {
    double totalPorts;
    double transferRate;

    boolean batteryRequired;

    public UsbHub(double totalPorts, double transferRate, boolean batteryRequired){
        this.totalPorts=totalPorts;
        this.transferRate=transferRate;
        this.batteryRequired=batteryRequired;
        System.out.println("Running UsbHub");
    }

    @Override
    public  boolean equals(Object obj){
        UsbHub usbHub= this;
        if (obj!=null){
            if (obj instanceof UsbHub){
                UsbHub ref=(UsbHub) obj;
                if (usbHub.totalPorts== ref.totalPorts && usbHub.transferRate==ref.transferRate && usbHub.batteryRequired==ref.batteryRequired){
                    System.out.println("UsbHub and UsbHub1 are same when compared with totalPorts, transferRate and batteryRequired");
                return true;
                }
                else{
                    System.err.println("UsbHub and UsbHub1 are not same when compared with totalPorts, transferRate and batteryRequired");
                }
            }
        }
        else {
            System.err.println("Object not found");
        }
        return  false;
    }
}
