
//14 WAP to calculate an angle between hour and minute hand.

import java.util.Scanner;

public class P14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hour (0 - 12): ");
        int hour = sc.nextInt();

        System.out.print("Enter minutes (0 - 59): ");
        int minutes = sc.nextInt();

        hour = hour%12;
        double hourAngle  = 0.5*(60 * hour + minutes);
        double minuteAngle = 6 * minutes;

        double angle = Math.abs(hourAngle - minuteAngle);
        angle = Math.min(angle , 360-angle);

        System.out.println("The angle between hour and minute hand is: " + angle + " degrees.");
    }   
}
