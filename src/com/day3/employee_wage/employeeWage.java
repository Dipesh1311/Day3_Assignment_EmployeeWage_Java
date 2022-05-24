package com.day3.employee_wage;

import java.util.Random;

public class employeeWage {

    public static void main(String[] args) {

       Random a = new Random();
       int EmpAttendance = a.nextInt(2);
       System.out.println(EmpAttendance);

       if (EmpAttendance == 1) {
           System.out.println("Employee is presend");
       }
           else {
               System.out.println("Employee is absent");
       }
    }
}
