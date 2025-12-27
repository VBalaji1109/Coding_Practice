package Basics;
import java.util.*;
import java.lang.*;

public class Occurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        occurencesIntegerCount(sc);
        occuerencesStringCount(sc);
    }

    private static void occurencesIntegerCount(Scanner sc) {
        int n = sc.nextInt();
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int max = -1;
        int result = 0;
        while(n!= 0){
            int t = n%10;
            map.put(t,map.getOrDefault(t,0)+1);
            if (map.containsKey(t) && map.get(t) > max) {
                max = map.get(t);
                result = t;
            }
            n /=10;
        }
        System.out.println(result + " with occurences: " + max);
    }

    private static void occuerencesStringCount(Scanner sc) {
        String n = sc.next();
        Map<Character, Integer> map = new HashMap<>();
        int max = -1;
        char result = ' ';
        for(int i = 0; i<n.length(); i++){
            char t = n.charAt(i);
            map.put(t, map.getOrDefault(t,0)+1);
            if(map.containsKey(t) && map.get(t)> max){
                max = map.get(t);
                result = t;
            }

        }
        System.out.println(result + " with occurences: " + max);
    }
}
