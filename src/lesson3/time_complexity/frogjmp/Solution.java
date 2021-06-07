package lesson3.time_complexity.frogjmp;

public class Solution {
    public static int solution(int X, int Y, int D){
        int jumps = (Y-X)/D;
        if((Y-X) % D > 0){
            return jumps+1;
        }
        return jumps;
    }
    public static void main(String[] args) {
        System.out.println(solution(10,85,30));

    }
}
