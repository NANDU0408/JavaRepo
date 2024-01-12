package com.xworkz.nandish.comparable.dtoRunner;

import com.xworkz.nandish.comparable.dto.AlarmDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlarmRunner {
    public static void main(String[] args) {

        AlarmDTO alarmDTO = new AlarmDTO("Square", "AnalogClock", 750, 15.40);
        AlarmDTO alarmDTO1 = new AlarmDTO("Triangle", "Digital", 510, 17.00);
        AlarmDTO alarmDTO2 = new AlarmDTO("Round", "Mobile", 150, 10.00);
        AlarmDTO alarmDTO3 = new AlarmDTO("Rectangle", "AnalogWatch", 190, 14.00);
        AlarmDTO alarmDTO4 = new AlarmDTO("Geoid", "Watch", 650, 12.00);

        List<AlarmDTO> list = new ArrayList<>();
        list.add(alarmDTO);
        list.add(alarmDTO1);
        list.add(alarmDTO2);
        list.add(alarmDTO3);
        list.add(alarmDTO4);

        Collections.sort(list);
        for (AlarmDTO dto:list){
            System.out.println(dto);
        }

    }
}
