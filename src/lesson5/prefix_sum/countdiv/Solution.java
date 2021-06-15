package lesson5.prefix_sum.countdiv;

public class Solution {
    public static int solution(int A,int B,int K){
        int count = (B-A)/K;
        if(A % K == 0 || B % K == 0){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(6,11,2));
    }
}
