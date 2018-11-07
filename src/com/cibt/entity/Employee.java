/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.entity;

/**
 *
 * @author DELL
 */
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, String address, String phoneNumber, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", phoneNumber=" + phoneNumber + ", email=" + email + '}';
    }

    public String saveFormat() {

        StringBuilder builder = new StringBuilder();

        builder.append("id: " + id + "\r\n")
                .append("Name: " + firstName + " " + lastName + "\r\n")
                .append("Tel: " + phoneNumber + "\r\n").append("Email: " + email + "\r\n")
                .append("Address: " + address + "\r\n");

        return builder.toString();
    }

}
