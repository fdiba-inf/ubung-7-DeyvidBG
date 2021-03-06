package exercise7;

import java.util.Scanner;

public class TimeValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean timeValid = false;

        System.out.print("Enter hours: ");
        int hours = input.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = input.nextInt();

        if(areMinutesValid(minutes) && areHoursValid(hours)) timeValid = true;

        System.out.println("Time valid: " + timeValid);
    }


    public static boolean areHoursValid(int hours) {
        if(hours >= 0 && hours <= 24) return true;
        return false;
    }


    public static boolean areMinutesValid(int minutes) {
        if(minutes >= 0 && minutes <= 60) return true;
        return false;
    }
}
