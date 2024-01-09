package com.xworkz.interfacea.nandishA.cloneBoot;

import com.xworkz.interfacea.nandishA.clone.Scanner;

public class ScannerRunner{
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println();
        System.out.println("Scanner");
        Scanner scanner= new Scanner("IMPDOC",58,"Confidential",2);
        System.out.println(scanner);
        Scanner ref = scanner.clone();
        System.out.println("Clone of "+ref);
    }
}
