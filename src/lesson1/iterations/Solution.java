package lesson1.iterations;

public class Solution {
    public static int solution(int n){
        n >>>= Integer.numberOfTrailingZeros(n);
        int steps = 0;
        while ((n & (n + 1)) != 0) {
            n |= n >>> 1;
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(solution(1041));
    }
}
