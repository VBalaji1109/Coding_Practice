package Basics;
import java.util.*;
import java.lang.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        reverseInteger(sc);
        reverseString(sc);
    }

    private static void reverseString(Scanner sc) {
        String n = sc.next();
        StringBuilder reversed = new StringBuilder();
        for(int i = n.length(); i>0; i--){
//            reversed = reversed+n.charAt(i-1);
            reversed.append(n.charAt(i - 1));
        }
        System.out.println(reversed);
    }

    private static void reverseInteger(Scanner sc) {
        int n = sc.nextInt();
        int reversed = 0;
        while(n!=0){
            int t = (n%10);
            reversed = (reversed * 10) + t;
            n /=10;
        }
        System.out.println(reversed);
    }
}
