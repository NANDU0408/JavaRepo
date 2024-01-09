package com.xworkz.interfacea.nandishA.aman;

public class HostelImpl implements HostelRule {
    private boolean gatesClosed;

    @Override
    public void entryTime(boolean gatesClosed) {
        this.gatesClosed=gatesClosed;
        System.out.println("GatesClosed:"+gatesClosed);
        System.out.println("Entry time is fixed");
    }

    @Override
    public boolean lateEntry() {
        System.out.println("Not Allowed");
        return false;
    }

    @Override
    public void rulesFollowed() {
        System.out.println("Should Follow");
    }

    @Override
    public void cctvCoverage() {
        System.out.println("Working");
    }
}
