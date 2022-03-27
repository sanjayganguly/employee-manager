package techDepartment;

import superDepartment.sclass;

public class tech extends sclass {

    String departmentName() {
        return "Tech Department";
        System.out.println("Tech Department");
    }

        String getTodaysWork() {
        return "Complete coding of module 1";
        System.out.println("Complete coding of module 1");
    }

    @Override
    String getWorkDeadline() {
        return "Complete by EOD";
        System.out.println("Complete by EOD");
    }

    String getTechStackInformation() {
        return "core java";
        System.out.println("core java");
    }
}






}
