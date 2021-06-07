package lesson2.arrays.cyclic_rotation;

public class Solution {
    public static int[] solution(int[] a, int k){
        int[] newArr = new int[a.length];
        for(int i=0; i<a.length; i++){
            newArr[(i+k) % a.length] = a[i];
        }
        for(int i=0; i<a.length;i++){
            a[i]=newArr[i];
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {3,8,9,7,6};
        int[] res = solution(arr,3);
        for(int i : res){
            System.out.println(i);
        }
    }
}
