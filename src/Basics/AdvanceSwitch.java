package Basics;

import java.util.Scanner;

public class AdvanceSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        switch (day) {
            case "Monday", "monday" -> System.out.println("It's Monday!");
            case "Tuesday", "tuesday" -> System.out.println("It's Tuesday!");
            case "Wednesday", "wednesday" -> System.out.println("It's Wednesday!");
            case "Thursday", "thursday" -> System.out.println("It's Thursday!");
            case "Friday", "friday" -> System.out.println("It's Friday!");
            case "Saturday", "saturday" -> System.out.println("It's Saturday!");
            case "Sunday", "sunday" -> System.out.println("It's Sunday!");
            default -> System.out.println("Invalid day!");
        }
    }
}
