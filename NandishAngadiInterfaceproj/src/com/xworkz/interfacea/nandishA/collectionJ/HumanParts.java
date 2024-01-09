package com.xworkz.interfacea.nandishA.collectionJ;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HumanParts {
    public static void main(String[] args) {
        Collection<String> hupa = new ArrayList<>();
        hupa.add("Head");
        hupa.add("Hair");
        hupa.add("Forehead");
        hupa.add("Temple");
        hupa.add("Eyebrow");
        hupa.add("Eyelid");
        hupa.add("Eye");
        hupa.add("Ear");
        hupa.add("Nose");
        hupa.add("Cheek");
        hupa.add("Mouth");
        hupa.add("Lip");
        hupa.add("Tongue");
        hupa.add("Tooth/Teeth");
        hupa.add("Jaw");
        hupa.add("Chin");
        hupa.add("Neck");
        hupa.add("Throat");
        hupa.add("Adam's apple");
        hupa.add("Shoulder");
        hupa.add("Arm");
        hupa.add("Elbow");
        hupa.add("Forearm");
        hupa.add("Wrist");
        hupa.add("Hand");
        hupa.add("Palm");
        hupa.add("Finger");
        hupa.add("Thumb");
        hupa.add("Index finger");
        hupa.add("Middle finger");
        hupa.add("Ring finger");
        hupa.add("Little finger");
        hupa.add("Fingernail");
        hupa.add("Chest");
        hupa.add("TileBone");
        hupa.add("Rib");
        hupa.add("Abdomen");
        hupa.add("Belly");
        hupa.add("Navel");
        hupa.add("Back");
        hupa.add("Spine");
        hupa.add("Waist");
        hupa.add("Hip");
        hupa.add("Buttocks");
        hupa.add("Leg");
        hupa.add("Thigh");
        hupa.add("Knee");
        hupa.add("Calf");
        hupa.add("Ankle");
        hupa.add("Heel");
        hupa.add("Foot");
        hupa.add("Sole");
        hupa.add("Toe");
        hupa.add("Big toe");
        hupa.add("Second toe");
        hupa.add("Third toe");
        hupa.add("Fourth toe");
        hupa.add("Little toe");
        hupa.add("Achilles tendon");
        hupa.add("Armpit");
        hupa.add("Collarbone");
        hupa.add("Pelvis");
        hupa.add("Hips");
        hupa.add("Tailbone");
        hupa.add("Patella (Kneecap)");
        hupa.add("Triceps");
        hupa.add("Biceps");
        hupa.add("Tendon");
        hupa.add("Ligament");
        hupa.add("Cartilage");
        hupa.add("Joint");
        hupa.add("Vein");
        hupa.add("Artery");
        hupa.add("Nerve");
        hupa.add("Tissue");
        hupa.add("Muscle");
        hupa.add("Skin");
        hupa.add("Epidermis");
        hupa.add("Dermis");
        hupa.add("Pore");

        Iterator<String> itr = hupa.iterator();
        while (itr.hasNext()){
            String hu = itr.next();
            if (hu.length()<5){
                System.out.println("Human Body parts with less than 5 characters:" +hu);
            }

        }    }
}
