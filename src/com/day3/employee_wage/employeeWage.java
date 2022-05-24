package com.day3.employee_wage;

import java.util.Random;

public class employeeWage {

    static final int EMP_WAGE_PER_HOUR = 20;
    static final int EMP_FULL_DAY_HOUR = 8;
    static final int EMP_HALF_DAY_HOUR = 4;
    static final int FULL_TIME=1;
    static final int HALF_TIME=2;

    static int DailyWage;
    static int HalfDayWage;

    public static void main(String[] args) {

       Random a = new Random();
       int EmpAttendance = a.nextInt(3);
       System.out.println(EmpAttendance);

        switch (EmpAttendance) {
            case FULL_TIME:
                System.out.println("Employee is present for full day");
                DailyWage = EMP_WAGE_PER_HOUR * EMP_FULL_DAY_HOUR;
                System.out.println("Employee Daily Wage is : " + DailyWage);
                break;
            case HALF_TIME:
                System.out.println("Employee is Present for half day");
                HalfDayWage = EMP_WAGE_PER_HOUR * EMP_HALF_DAY_HOUR;
                System.out.println("Employee Daily wage is : " + HalfDayWage);
                break;
            default:
                System.out.println("Employee is Absent");
       }
    }
}
