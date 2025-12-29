package CodingPractice.BinarySearch;

import java.util.Scanner;

//Find the greatest floor number which is less than the target
public class FloorNumber {
    public static void main(String[] args) {
//        int[] arr = {0,1,2,3,4,5,6,7,9,10};
        int[] arr = {1,6,9,11,34,65,77,78,79,80,84,90};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    // return the index of smallest no >= target
    static int ceiling(int[] arr, int target) {

        // but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return end;
    }
}