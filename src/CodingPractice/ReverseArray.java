package CodingPractice;

import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i< n; i++){
            arr[i] = in.nextInt();
        }

        int start = 0;
        int end = n-1;

        while(start<end){
            swap(arr,start,end);
            start++;
            end--;

        }
        System.out.println(Arrays.toString(arr));
        in.close();
    }
    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
