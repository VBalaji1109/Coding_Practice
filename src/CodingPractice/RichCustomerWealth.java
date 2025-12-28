package CodingPractice;

public class RichCustomerWealth {
    public static void main(String[] args) {
        int[][] data =  {{1,2,3},{3,7,1},{4,7},{94},{4,0,5,6,7,9}};
        int max = 0;
        for(int[] arr:data){
           if(max<sum(arr)){
            max = sum(arr);
           };
        }
        System.out.println("Richest Customer Wealth is : "+ max);
    }
    static int sum(int[] a){
        int sum = 0;
        for(int i : a){
            sum +=i;
        }
        return sum;
    }
}
