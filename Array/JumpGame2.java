package Leetcode150.Array;

public class JumpGame2 {
    public static void main(String[] args){
        int[] arr = {2,3,1,1,4};
        System.out.println(canJump(arr));
    }
    static int canJump(int[] nums){
        int destination = nums.length-1;
        int totalJumps =0;
        int coverage=0;
        int lastJumpIndex=0;

        for(int i=0;i<nums.length;i++){
            coverage= Math.max(coverage,i+nums[i]);
            if (i==lastJumpIndex){
                lastJumpIndex=coverage;
                totalJumps++;
                if (coverage>=destination){
                    return totalJumps;
                }
            }
        }
        return totalJumps;
    }
}
