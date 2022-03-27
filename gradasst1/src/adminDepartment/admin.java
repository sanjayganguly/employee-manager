package adminDepartment;

import superDepartment.sclass;

public class admin extends sclass {

        
        String departmentName() {
            String AdminDepartment = "Admin Department";
            System.out.println("Admin Department");
            return departmentName();
        }
        
        String getTodaysWork() {
            String gettodayswork = "Complete your document Submission";
            System.out.println("Complete your document Submission");
             return getTodaysWork()
        }
        @Override
        String getWorkDeadline() {
            String gettodayswork = "Complete by EOD";
            System.out.println("Complete your document Submission");
            return getWorkDeadline()

        }

    }


