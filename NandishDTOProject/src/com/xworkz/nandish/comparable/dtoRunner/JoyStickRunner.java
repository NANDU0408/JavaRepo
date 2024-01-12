package com.xworkz.nandish.comparable.dtoRunner;

import com.xworkz.nandish.comparable.dto.JoyStickDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JoyStickRunner {
    public static void main(String[] args) {

        JoyStickDTO joyStickDTO = new JoyStickDTO("Gaming Joystick", "White", 750);
        JoyStickDTO joyStickDTO1 = new JoyStickDTO("Aircraft Joystick", "Yellow", 1510);
        JoyStickDTO joyStickDTO2 = new JoyStickDTO("Helicopter Collective", "Orange", 1500);
        JoyStickDTO joyStickDTO3 = new JoyStickDTO("Digital Joystick", "Green", 900);
        JoyStickDTO joyStickDTO4 = new JoyStickDTO("Force Feedback Joystick", "Blue", 950);

        List<JoyStickDTO> list = new ArrayList<>();
        list.add(joyStickDTO);
        list.add(joyStickDTO1);
        list.add(joyStickDTO2);
        list.add(joyStickDTO3);
        list.add(joyStickDTO4);

        Collections.sort(list);
        for (JoyStickDTO dto:list){
            System.out.println(dto);
        }

    }
}
