package algorithm.binary_search;

public class Solution {
    public static boolean binarySearchRecursive(int[] arr, int x, int left,int right){
        int mid = left + ((right-left)/2);
        if(left > right){ return false; }
        if(arr[mid] == x){
            return true;
        }else if(x < arr[mid]){
            return binarySearchRecursive(arr,x,left,mid-1);
        }else{
            return binarySearchRecursive(arr,x,mid+1,right);
        }
    }

    public static boolean binarySearchRecursive(int[] arr, int x){
        return binarySearchRecursive(arr, x, 0, arr.length-1);
    }

    public static boolean binarySearchIterative(int[] arr,int x){
        int left = 0;
        int right = arr.length-1;
        while(left <= right){
            int mid = left +((right-left)/2);
            if(arr[mid]==x){
                return true;
            } else if(x < arr[mid]){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(binarySearchRecursive(arr,5));
    }
}
