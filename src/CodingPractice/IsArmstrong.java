package CodingPractice;

import java.util.*;

public class IsArmstrong {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.print("Enter a number: ");
        System.out.print(isArmstrongNumber(in.nextInt()));
    }

    static boolean isArmstrongNumber(int i) {

        int n = i;
        int arm = 0;
        while(n>0){
            arm = (n%10) * (n%10) * (n%10) + arm;
            n = n/10;
        }
        if(arm != i){
            return false;
        }
        return true;
    }
}
