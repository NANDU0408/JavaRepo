package com.xworkz.interfacea.nandishA.boot;

import com.xworkz.interfacea.nandishA.aman.CourtRule;
import com.xworkz.interfacea.nandishA.aman.CourtImpl;

public class CourtRunner {
    public static void main(String[] args) {
        CourtRule court= new CourtImpl();
        court.courtRules("Naman");
        court.rulesFollowed("Vijay",true);
        court.ipcSectionExecuted();
        court.judicialOffice();
        CourtImpl court1 = new CourtImpl();
        court1.courtRules("Jaanvi");
        court1.rulesFollowed("Viraj",false);
        court1.ipcSectionExecuted();
        court1.judicialOffice();
    }
}
