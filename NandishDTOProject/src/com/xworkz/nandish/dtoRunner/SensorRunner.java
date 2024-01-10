package com.xworkz.nandish.dtoRunner;

import com.xworkz.nandish.dto.SensorDTO;
import com.xworkz.nandish.dtoImpl.sensorImpl.SensorDTOImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SensorRunner {
    public static void main(String[] args) {
        SensorDTO sensorDTO = new SensorDTO("Sensor1","Infrared",545,500);
        SensorDTO sensorDTO1 = new SensorDTO("Sensor2","Temperature",676,796);
        SensorDTO sensorDTO2 = new SensorDTO("Sensor3","Mobile",234,124);
        SensorDTO sensorDTO3 = new SensorDTO("Sensor4","Radio",132,454);
        SensorDTO sensorDTO4 = new SensorDTO("Sensor5","Direct",894,122);

        List<SensorDTO> list = new ArrayList<>();
        list.add(sensorDTO);
        list.add(sensorDTO1);
        list.add(sensorDTO2);
        list.add(sensorDTO3);
        list.add(sensorDTO4);
        Comparator<SensorDTO> ref = new SensorDTOImpl(){
            @Override
            public int compare(SensorDTO o1, SensorDTO o2) {
                double first = o1.getCost();
                double f2 = o2.getCost();
                return Double.compare(f2,first);
            }
        };
        Comparator<SensorDTO> ref2 = new SensorDTOImpl(){
            public int compare(SensorDTO o1, SensorDTO o2) {
                int first1 = o1.getDistance();
                int f1 = o2.getDistance();
                return Double.compare(f1,first1);
            }
        };

        Comparator<SensorDTO> ref3 = new SensorDTOImpl(){
            public int compare(SensorDTO o1, SensorDTO o2) {
                int first1 = o1.getDistance();
                int f1 = o2.getDistance();
                return Double.compare(first1,f1);
            }
        };


        Comparator<SensorDTO> ref1 = new SensorDTOImpl();
        Collections.sort(list,ref);
        System.out.println();

        System.out.println("Cost In Descending Order");
        for (SensorDTO a : list){
            System.out.println(a);
        }
        System.out.println("**************************************************************");

        Collections.sort(list,ref1);

        System.out.println(" Cost In Ascending Order");
        for (SensorDTO a : list){
            System.out.println(a);
        }

        System.out.println("**************************************************************");
        Collections.sort(list,ref2);
        System.out.println("Distance In Descending Order");
        for (SensorDTO a : list){
            System.out.println(a);
        }

        System.out.println("**************************************************************");
        Collections.sort(list,ref3);
        System.out.println("Distance In Ascending Order");
        for (SensorDTO a : list){
            System.out.println(a);
        }

        System.out.println("**************************************************************");
        Comparator<SensorDTO> ref4 = new SensorDTOImpl(){
            public int compare(SensorDTO o1, SensorDTO o2) {
                String firstName = o1.getName();
                String fName = o2.getName();
                return firstName.compareTo(fName);
            }
        };

        Collections.sort(list,ref4);
        System.out.println(" Name In Ascending Order");
        for (SensorDTO a : list){
            System.out.println(a);
        }

        System.out.println("**************************************************************");
        Comparator<SensorDTO> ref5 = new SensorDTOImpl(){
            public int compare(SensorDTO o1, SensorDTO o2) {
                String firstName = o1.getName();
                String fName = o2.getName();
                return fName.compareTo(firstName);
            }
        };

        Collections.sort(list,ref5);
        System.out.println(" Name In Descending Order");
        for (SensorDTO a : list){
            System.out.println(a);
        }

        System.out.println("**************************************************************");
        Comparator<SensorDTO> ref6 = new SensorDTOImpl(){
            public int compare(SensorDTO o1, SensorDTO o2) {
                String firsttype = o1.getType();
                String ftype = o2.getType();
                return firsttype.compareTo(ftype);
            }
        };

        Collections.sort(list,ref6);
        System.out.println(" Type In Ascending Order");
        for (SensorDTO a : list){
            System.out.println(a);
        }

        System.out.println("**************************************************************");
        Comparator<SensorDTO> ref7 = new SensorDTOImpl(){
            public int compare(SensorDTO o1, SensorDTO o2) {
                String firsttype = o1.getType();
                String ftype = o2.getType();
                return ftype.compareTo(firsttype);
            }
        };

        Collections.sort(list,ref7);
        System.out.println(" Type In Descending Order");
        for (SensorDTO a : list){
            System.out.println(a);
        }
    }
}
