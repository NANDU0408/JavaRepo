package com.xworkz.nandish.comparable.set.setRunner;

import com.xworkz.nandish.comparable.set.setDTO.personjobDTO.JobDTO;
import com.xworkz.nandish.comparable.set.setDTO.personjobDTO.Person1DTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PersonJobRunner {
    public static void main(String[] args) {
        Person1DTO person1 = new Person1DTO("John", "john@gmail.com");
        Person1DTO person2 = new Person1DTO("Jane", "jane@gmail.com");
        Person1DTO person3 = new Person1DTO("Mike", "mike@gmail.com");
        Person1DTO person4 = new Person1DTO("Lara", "lara@gmail.com");
        Person1DTO person5 = new Person1DTO("Jahanavi", "jahanvi@gmail.com");

        JobDTO job1 = new JobDTO("Software Engineer", 80000.0, "XYZ Tech");
        JobDTO job2 = new JobDTO("Marketing Specialist", 60000.0, "ABC Corp");
        JobDTO job3 = new JobDTO("Heart Specialist", 60000.0, "CVC Corp");
        JobDTO job4 = new JobDTO("ENT Specialist", 60000.0, "GFH Corp");
        JobDTO job5 = new JobDTO("Kidney Specialist", 60000.0, "SYG Corp");

        Map<Person1DTO, JobDTO> personJobMap = new HashMap<>();
        personJobMap.put(person1, job1);
        personJobMap.put(person2, job2);
        personJobMap.put(person3, job3);
        personJobMap.put(person4, job4);
        personJobMap.put(person5, job5);


        Person1DTO person6 = new Person1DTO("Emily", "john@gmail.com");
        JobDTO job6 = new JobDTO("Product Manager", 95000.0, "Innovate Inc");

        System.out.println("Person6 is existing: " + personJobMap.containsKey(person4));
        System.out.println();

        personJobMap.put(person6, job6);

        personJobMap.forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println("===================");

        System.out.println();
        System.out.println("Printing both key and value");
        Set<Map.Entry<Person1DTO, JobDTO>> entrySet = personJobMap.entrySet();
        for (Map.Entry<Person1DTO, JobDTO> entry : entrySet) {
            Person1DTO key1 = entry.getKey();
            JobDTO value1 = entry.getValue();
            System.out.println("Person: " + key1 + ", Job: " + value1);
        }
    }
}
