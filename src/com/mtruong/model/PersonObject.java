package com.mtruong.model;

public class PersonObject {
    // use boilerplate keymap shortcut to make "getter/setter" methods to encapsulate the private fields &
// control access to the Data
    private int age;
    private String firstName;
    private String lastName;

    public PersonObject(String s, String s1, int i) {
    }

    public PersonObject() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "PersonObject{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}
