package Basics;
import java.util.*;
import java.lang.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 0;
        while(count <= n){
            int t = b;
            b = b+a;
            a = t;
            count++;
        }
        System.out.println("Fibonacci for "+ n + " is " +a);
    }
}
