package com.gliitr.em.service;

import com.gliitr.em.customer.ProfileGeneratorEmployee;
import com.gliitr.em.emrecords.Employee;

import java.util.Scanner;

public class GenerateProfile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Your First Name");
        String firstName = sc.nextLine();

        System.out.println("Please enter Your Last Name");
        String lastName = sc.nextLine();

        System.out.println("Please enter Your option for Department");
        System.out.println("For Administration Deptt. = 0 ");
        System.out.println("For HR Deptt. = 1 ");
        System.out.println("For Technical Deptt. = 2 ");
        System.out.println("For Legal Deptt. = 3 ");
        int option = sc.nextint();
        Employee employee = new Employee(firstName, lastName);
        switch (option){
            case 0:
                employee.setdeptt("Administration");
                break;
            case 1:
                employee.setdeptt("HR");
                break;

            case 2:
                employee.setdeptt("Technical");
                break;
            case 3:
                employee.setdeptt("Legal");
                break;

        }
        String emailAddress =  ProfileGeneratorEmployee.generateEmailaddress(firstName,lastName,employee.getdeptt());
        employee.generateEmailAddress(emailAddress);

        System.out.println("Pleaese enter the length of the password");
        int length=scanner.nextInt(radix;());

        String passWord = ProfileGeneratorEmployee.generatePassWord(length)}
        Employee.setPassWord(passWord)

        // close finally
        scanner.close();

    }
}

