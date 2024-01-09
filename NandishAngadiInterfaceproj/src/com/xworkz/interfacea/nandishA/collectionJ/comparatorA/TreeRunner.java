package com.xworkz.interfacea.nandishA.collectionJ.comparatorA;


import com.xworkz.interfacea.nandishA.collectionJ.comparatorBoot.Tree;

import java.util.*;

public class TreeRunner {
    public static void main(String[] args) {
        List<Integer> tree = new ArrayList<>();
        tree.add(38);
        tree.add(127);
        tree.add(400);
        tree.add(56);
        tree.add(71);
        tree.add(74);
        tree.add(91);
        tree.add(100);
        tree.add(101);
        tree.add(111);
        Collections.sort(tree);
        System.out.println("Tree age in ascending order: ");
        for (int ref: tree){
            System.out.println(ref);
        }
        System.out.println();

        Comparator<Integer> comparator = new Tree();
        Collections.sort(tree,comparator);
        System.out.println("Tree age in ascending order: ");
        for (int ref: tree){
            System.out.println(ref);
        }
    }
}
