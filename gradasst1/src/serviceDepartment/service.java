package serviceDepartment;

import adminDepartment.admin;
import hrDepartment.hr;
import superDepartment.sclass;
import techDepartment.tech;

public class service {
    public static void main(String[] args) {

        sclass s1 = new admin();

        s1.departmentName();
        System.out.println("Welcome to Admin Department");

        s1.getTodaysWork();
        System.out.println("Complete your document Submission");

        s1.getWorkDeadline();
        System.out.println("Complete by EOD");

        admin s2 = new (admin) s1;
        s2.isTodayAHoliday();
        System.out.println("Today is not a Holiday");


        hr s3 = new hr();
        s3.departmentName();
        System.out.println("Welcome to Hr Department");

        s3.doActivity();
        System.out.println("team Lunch");

        s3.getTodaysWork();
        System.out.println("Fill today's timesheet and mark your attandance");

        s3.getWorkDeadline();
        System.out.println("Complete by EOD");

        hr s4 = (hr) s3;
        s4.isTodayAHoliday();
        System.out.println("Today is not a Holiday");


        sclass s5 = new tech();

        s5.departmentName();
        System.out.println("Welcome to Tech Department");

        s5.getTodaysWork();
        System.out.println("Complete coding of Module 1");

        s5.getWorkDeadline();
        System.out.println("Complete by EOD\n Core Java");

        tech s6 = (tech) s5;
        s6.isTodayAHoliday();
        System.out.println("Core java");
        System.out.println("Today is not a Holiday");

    }


}
