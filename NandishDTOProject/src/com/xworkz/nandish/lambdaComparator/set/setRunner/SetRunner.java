package com.xworkz.nandish.lambdaComparator.set.setRunner;

import com.xworkz.nandish.comparable.set.setDTO.AddressDTO;
import com.xworkz.nandish.comparable.set.setDTO.PersonDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SetRunner {
    public static void main(String[] args) {
        PersonDTO personDTO = new PersonDTO("Vikas", "vikas@gmail.com");
        PersonDTO personDTO1 = new PersonDTO("Shivam","shivam@gmail.com");
        PersonDTO personDTO2 = new PersonDTO("Radha","radha12345@gmail.com");
        PersonDTO personDTO3 = new PersonDTO("Krishna","krishna12345@gmail.com");
        PersonDTO personDTO4 = new PersonDTO("Radha","radha5@gmail.com");

        AddressDTO addressDTO = new AddressDTO(678672876,562447,"BTM");
        AddressDTO addressDTO1 = new AddressDTO(82789293,647744,"Marathalli");
        AddressDTO addressDTO2 = new AddressDTO(78253678,674747,"Haveri");
        AddressDTO addressDTO3 = new AddressDTO(63787389,245324,"Chennasandra");
        AddressDTO addressDTO4 = new AddressDTO(64738922,562447,"BTM");

        Map<PersonDTO,AddressDTO> person = new HashMap<>();
        person.put(personDTO,addressDTO);
        person.put(personDTO2,addressDTO2);
        person.put(personDTO3,addressDTO3);
        person.put(personDTO4,addressDTO4);
        person.put(personDTO1,addressDTO1);



        PersonDTO personDTO5 = new PersonDTO("Karan","krishna12345@gmail.com");
        AddressDTO addressDTO5= new AddressDTO(64738777,637786,"Majestic");

        System.out.println("Person6 is existing: " +person.containsKey(personDTO5));
        System.out.println();
        person.put(personDTO5,addressDTO5);

        person.forEach((k,v)-> System.out.println(k +" : "+v));

        System.out.println("===================");

        System.out.println();
        System.out.println("Printing both key and value");
        Set<Map.Entry<PersonDTO,AddressDTO>> entrySet = person.entrySet();
        for (Map.Entry<PersonDTO,AddressDTO> entry : entrySet){
            PersonDTO key1 = entry.getKey();
            AddressDTO value1 = entry.getValue();
            System.out.println("Person: " + key1 + ", Address: " + value1);
        }
    }
}
