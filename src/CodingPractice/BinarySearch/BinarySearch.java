package CodingPractice.BinarySearch;
//BruteForce Approach
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10};
        int mid = (arr.length-1)/2;
        int start = 0;
        int x = binarySearch(arr, 22,start,mid);
        System.out.println("Binary Search index was: "+x);
    }
    static int binarySearch(int[] a, int target, int start, int mid){
        if(target > a[a.length-1] || target < a[0]) return 0;
        while(start<mid){
            if (a[mid]==target) return mid;
            if(a[start]==target) return start;
            if(a[mid]<target){
                start = mid+1;
                mid = mid+(a.length-1)/2;
            }
            if(a[mid]>target){
                start++;
            }
        }
        return 0;
    }
}
