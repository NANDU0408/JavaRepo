package com.xworkz.nandish.dtoImpl.sensorImpl;

import com.xworkz.nandish.dto.SensorDTO;

import java.util.Comparator;

public class SensorDTOImpl implements Comparator<SensorDTO> {

    //@Override
    //public int compare(SensorDTO o1, SensorDTO o2) {
      //  double first = o1.getCost();
        //double f2 = o2.getCost();
        //return Double.compare(first,f2);
    //}
@Override
   public int compare(SensorDTO o1, SensorDTO o2) {
       double first = o1.getCost();
       double f2 = o2.getCost();
       return Double.compare(first,f2);
   }
}
