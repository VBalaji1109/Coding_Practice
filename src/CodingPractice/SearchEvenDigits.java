package CodingPractice;

public class SearchEvenDigits {
    public static void main(String[] args) {
        int [] arr = {2,34,555,6636,3456};
        int result = 0;
        for(int i = 0; i< arr.length; i++){
            int count = 0;
            if(isEvenDigit(arr[i],count)){
                result ++;
            }
        }
        System.out.println("Even Digits in array are : "+ result);
    }

    static boolean isEvenDigit(int i, int count) {
        while(i!=0){
            count++;
            i/=10;
        }
        return count%2==0;
    }
}
