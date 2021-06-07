package lesson2.arrays.odd_occurences_in_arr;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static int solution(int[] A){
        HashMap<Integer, Integer> hashedA = new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(hashedA.containsKey(A[i])){
                int val = hashedA.get(A[i]);
                hashedA.put(A[i], val+1);
            }else{
                hashedA.put(A[i], 1);
            }
        }
        for(Integer a:hashedA.keySet()){
            if(hashedA.get(a) % 2 !=0)
                return a;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {9,3,9,3,9,7,9};
        System.out.println(solution(arr));
    }
}
