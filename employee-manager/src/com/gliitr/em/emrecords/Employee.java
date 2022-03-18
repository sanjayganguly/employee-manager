package com.gliitr.em.emrecords;

public class Employee {

    private final String firstName;
    private final String lastName;
    private String emailAddress;
    private String passWord;
    private String deptt;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public static String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setdeptt(String deptt) {
        return deptt;
    }
    public String getDeptt() {
        String deptt = this.deptt;
        return deptt;

    } {this.deptt = deptt;}


