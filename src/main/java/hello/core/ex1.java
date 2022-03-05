package hello.core;

import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;

        int result = 0;

        for(int i=0; i< nums.length; i++){
            if(nums[i] == target){
                result = i;
                break;
            }
        }

        for(int i=0; i< nums.length; i++){
            if(nums[i] > target){
                result = i;
                break;
            }
            if(i+1 == nums.length){
                result = nums.length;
            }
        }

        System.out.println("result = " + result);
    }
}
