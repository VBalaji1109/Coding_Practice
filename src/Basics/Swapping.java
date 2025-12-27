package Basics;

// src/Basics/Swapping.java
public class Swapping {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int[] swapped = swap(a, b);
        a = swapped[0];
        b = swapped[1];
        System.out.println("a: " + a + " b: " + b);
    }

    static int[] swap(int a, int b) {
        return new int[] { b, a };
    }
}
