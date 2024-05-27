package Leetcode150.Array;

public class JumpGame {
    public static void main(String[] args){
        int[] arr = {3,2,1,0,4};
        System.out.println(canJump(arr));
    }
    static boolean canJump(int[] nums){
        int finalPosition = nums.length-1;
        for (int i=nums.length-2;i>=0;i--){
            if (i+nums[i]>=finalPosition){
                finalPosition=i;
            }
        }
        return finalPosition == 0;
    }
}
