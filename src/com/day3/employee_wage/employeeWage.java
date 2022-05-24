package com.day3.employee_wage;

import java.util.Random;

public class employeeWage {

    static final int EMP_WAGE_PER_HOUR = 20;
    static final int EMP_FULL_DAY_HOUR = 8;
    static final int EMP_PART_TIME_HOUR = 4;

    static int DailyWage;
    static int HalfDayWage;

    public static void main(String[] args) {

       Random a = new Random();
       int EmpAttendance = a.nextInt(3);
       System.out.println(EmpAttendance);

       if (EmpAttendance == 1) {
           System.out.println("Employee is present");
           DailyWage = EMP_WAGE_PER_HOUR * EMP_FULL_DAY_HOUR;
           System.out.println("Employee daily wages :"+DailyWage);
       }
       else if (EmpAttendance == 2) {
           System.out.println("Employee is on half day");
           HalfDayWage = EMP_WAGE_PER_HOUR * EMP_PART_TIME_HOUR;
           System.out.println("Employee half day wages :"+HalfDayWage);
       }
           else  {
               System.out.println("Employee is absent");
       }
    }
}
