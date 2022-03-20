package com.company;

/*
1. Write a program to calculate if a person is a senior citizen or not
age > 60 and age < 80
 */


import java.util.Calendar;

public class Q1CalculateAge {
    public static void main(String[] args) {
        calculateAge("16-06-1997");
        calculateAge("11-01-1999");
        calculateAge("03-04-1980");
    }

    public static boolean calculateAge(String dob) {
        Calendar cal = Calendar.getInstance();
        int cDay = cal.get(Calendar.DATE);
        int cMonth = cal.get(Calendar.MONTH) + 1;
        int cYear = cal.get(Calendar.YEAR);

        //16-06-1997
        //0123456789
        int yob = Integer.parseInt(dob.substring(6));
        int mob = Integer.parseInt(dob.substring(3, 5));
        int Dayob = Integer.parseInt(dob.substring(0, 2));

        int ageY;
        int ageM;
        int ageD;

        if (mob > cMonth) {
            ageY = cYear - yob - 1;
        } else if (mob < cMonth) {
            ageY = cYear - yob;
        } else {
            if (Dayob > cDay) {
                ageY = cYear - yob - 1;
            } else {
                ageY = cYear - yob;
            }
        }

        if (mob >= cMonth) {
            if (Dayob >= cDay) {
                ageM = (12 - mob) + cMonth - 1;
                ageD = (30 - Dayob) + cDay;
            }else {
                ageM = (12 - mob) + cMonth;
                ageD = cDay - Dayob;
            }
        }else {
            if (Dayob <= cDay) {
                ageM = cMonth - mob;
                ageD = cDay - Dayob;
            }else {
                ageM = cMonth - mob - 1;
                ageD = (30 - Dayob) + cDay;
            }
        }

        System.out.println("Years=" + ageY +
                " Months=" + ageM +
                " Days=" + ageD);
        boolean isSeniorCitizen = false;
        if (ageY >= 60) {
            isSeniorCitizen = true;
            return isSeniorCitizen;
        }
        return isSeniorCitizen;
    }

}