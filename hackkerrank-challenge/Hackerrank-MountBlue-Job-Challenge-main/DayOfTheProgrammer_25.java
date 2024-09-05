package MountBlue_2;

import java.util.Scanner;

public class DayOfTheProgrammer_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        String ans = dayOfTheProgrammer(year);
        System.out.println(ans);
    }

    static String dayOfTheProgrammer(int year) {
        /* SPECIAL TEST CASE */
        //The transition from the Julian to Gregorian calendar system occurred in 1918, when the next day after January 31st was February 14th. This means that in 1918, February 14th was the 32nd day of the year in Russia.
        // and in that year the total days were only 365 - 14 = 351 days as in february there were onlu 14 day from 14th feb to 28th feb

        if(year == 1918){
            return "26.9." + year; // we know that in the non leap year, the 256th day is 12th september therefore 12+14 = 26
        }

        // for GregOrian callender
        if (year > 1917) {
            if (isLeapYear(year)) {
                return "12.09." + year; // in java if you add anything(like char, integer, or object) with string it will automatically cast to string by calling toString method
            } else {
                return "13.09." + year;
            }
        } else{
            if (isLeapYear(year)) {
                return "12.09." + year;
            } else {
                return "13.09." + year;
            }
        }


    }

    static boolean isLeapYear(int year){
        // for Gregorian Callender
        if(year > 1917){
            // In the Gregorian calendar, lear years are divisible by 400 or divisible by 4 and not divisible by 100
            if(year % 400 == 0 || year % 4 == 0 && !(year % 100 == 0)) return true;
        }

        if(year < 1918){
            // In the Julian calendar, leap years are divisible by 4
            if(year % 4 == 0) return true;
        }

        return false;
    }
}

/*
Algorithm
1. if year is greater than 1917
    then if the year is leap year, then return 12.09. and respective year as it is the 256th day else return 13.09
2. if the year is less than 1918
        then if the year is leap year, then return 12.09. and respective year as it is the 256th day else return 13.09

 */