package algorithm.collatz;

import java.util.*;

// https://leetcode.com/problems/sort-integers-by-the-power-value/

public class Collatz {
    public static void main(String[] args) {
        //System.out.println(collector);

        System.out.println(getKth(144,163,5));
    }
    public static int collatzChain(int x){
        if(x == 1){
         return 0;
        } else{
            if(x % 2 == 0){
                return 1 + collatzChain(x/2);
            }else{
                return 1 + collatzChain(3*x+1);
            }
        }
    }

    public static int getKth(int lo, int hi, int k){
        Map<Integer,Integer> map = new TreeMap<>();
        List<Integer> list = new ArrayList<>();
        // populate the array and hashmap with its value
        for(int i = lo; i<=hi; i++){
            map.put(i, collatzChain(i));
        }
        map.entrySet().stream().sorted((k1,k2) -> k1.getValue().compareTo(k2.getValue()))
                .forEach(key -> list.add(key.getKey()));
        return list.get(k-1);
    }

}
