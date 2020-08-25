package com.olamide.springboot_practice.Person;

import java.util.UUID;

public class Person {
    private UUID name;
    private String gender;
    private int age;
    private Occupation occupation;

    static class Occupation{

        private String department;
        private String job;
        private int salary;

        Occupation(String department, String job, int salary){
            this.department = department;
            this.job = job;
            this.salary = salary;
        }

        public String getDepartment(){
            return department;
        }

        public String getJob(){
            return job;
        }

        public int getSalary(){
            return salary;
        }

    }


    public Person(UUID name, String gender, int age, Occupation occupation){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.occupation = occupation;
    }

    public UUID getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }

    public Occupation getOccupation(){
        return occupation;
    }
}
