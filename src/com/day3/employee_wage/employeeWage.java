package com.day3.employee_wage;

import java.util.Random;
public class employeeWage {
        public static void main(String[] args) {
            int day=1;
            int full = 8;
            int half = 4;
            int hrs = 0;
            int WagePerHr = 20;
            Random a = new Random();

            while (day<=20 && hrs<=100) {

                int EmpAttendance = a.nextInt(3);
                System.out.println("Day :" +day+ ":"+EmpAttendance);

                if (EmpAttendance == 1 && hrs < 93) {
                    hrs = hrs + full;
                    // System.out.println(hrs);
                }
                else if (EmpAttendance == 2 && hrs <97) {
                    hrs = hrs + half;
                    // System.out.println(hrs);
                }
                else {
                    hrs = hrs + 0;
                }
                day++;
            }
            System.out.println("total hrs :"+hrs);
            System.out.println("Total wages for a month of an employee :" +hrs*WagePerHr);
        }
    }