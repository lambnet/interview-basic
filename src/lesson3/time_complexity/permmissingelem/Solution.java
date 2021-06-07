package lesson3.time_complexity.permmissingelem;

import java.util.Arrays;

public class Solution {
    public static int solution(int[] A){
        int sn = ((A.length+1) * (A.length + 2))/2;
        //int sumA = Arrays.stream(A).reduce(0,(a,b) -> a+b);
        int sumA = 0;
        for(int a : A){
            sumA += a;
        }
        return sn-sumA;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,10};
        System.out.println(solution(arr));

    }

}
