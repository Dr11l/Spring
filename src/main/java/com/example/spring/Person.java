package com.example.spring;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

//    public Person(Pet pet) {
//        this.pet = pet;
//        System.out.println("Person created");
//    }
public Person() {
    System.out.println("Person created");
}
    public void setPet(Pet pet) {
        System.out.println("Class person setPet");

        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class person setSurname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class person setAge");
        this.age = age;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
