package probelms;

import java.util.Arrays;

public class LargestNum {
    public static void main(String[] args) {
        int[] arr = {10,13,45,67,33,73,78,333,2,0};
        System.out.println(Arrays.toString(largetNum(arr)));
    }
    public static int[] largetNum(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        int[] result = {max, min};
        return result;
    }
}
