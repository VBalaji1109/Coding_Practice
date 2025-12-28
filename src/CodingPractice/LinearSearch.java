package CodingPractice;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,67,32,56,97,-45,-5,23,54,11,45};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the element to be searched: ");
        int input = in.nextInt();
        System.out.println(linearSearch(arr, input));
    }

    static int linearSearch(int[] n, int target){
        if(n.length==0){
            return -1;
        }
        for(int i=0; i <n.length; i++){
            if( n[i]== target){
                return i;
            }
        }
        return -1;
    }
}
