package CodingPractice;

import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,4,3,2,1,0};
        int target = sc.nextInt();
        System.out.println("The Binary Search index of "+ target + " is : "+binarySearch(arr,target));
    }
    static int binarySearch(int[] arr, int target){
        boolean isAsc = false;
        if(arr[0]<arr[arr.length-1])  isAsc = true;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            if(arr[start]==target) return start;
            if(arr[end]==target) return end;
            int mid = start+(end-start)/2;
            if(target==mid) return mid;
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                } else {
                    start = mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}

