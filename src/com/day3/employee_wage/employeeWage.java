package com.day3.employee_wage;

import java.time.DayOfWeek;
import java.util.Random;

public class employeeWage {

    static final int EMP_WAGE_PER_HOUR = 20;
    static final int EMP_FULL_DAY_HOUR = 8;
    static int DailyWage;

    public static void main(String[] args) {

       Random a = new Random();
       int EmpAttendance = a.nextInt(2);
       System.out.println(EmpAttendance);

       if (EmpAttendance == 1) {
           System.out.println("Employee is present");
           DailyWage = EMP_WAGE_PER_HOUR * EMP_FULL_DAY_HOUR;
           System.out.println("Employee daily wages :"+DailyWage);
       }
           else {
               System.out.println("Employee is absent");
       }
    }
}
