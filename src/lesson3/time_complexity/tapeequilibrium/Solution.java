package lesson3.time_complexity.tapeequilibrium;


public class Solution {
    public static int solution(int[] A){
        int sumLeft = A[0];
        int sumRight =  0;
        for(int i=1;i<A.length;i++){
            sumRight += A[i];
        }
        int res = Math.abs(sumLeft-sumRight);

        for(int P = 1; P < A.length-1;P++){
            sumLeft += A[P];
            sumRight -= A[P];
            int resTmp = Math.abs(sumLeft-sumRight);
            if(resTmp < res){
                res = resTmp;
            }
        }
        return res;
    }
    
    
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,3};
        System.out.println(solution(arr));
    }
}
