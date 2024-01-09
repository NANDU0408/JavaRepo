package com.xworkz.interfacea.nandishA.boot;

import com.xworkz.interfacea.nandishA.aman.HostelRule;
import com.xworkz.interfacea.nandishA.aman.HostelImpl;

public class HostelRunner {
    public static void main(String[] args) {
        HostelRule hostel = new HostelImpl();
        hostel.cctvCoverage();
        hostel.entryTime(true);
        hostel.lateEntry();
        hostel.rulesFollowed();
        HostelImpl hostel1 = new HostelImpl();
        hostel1.entryTime(false);
        hostel1.cctvCoverage();
        hostel1.lateEntry();
        hostel1.rulesFollowed();
    }
}
