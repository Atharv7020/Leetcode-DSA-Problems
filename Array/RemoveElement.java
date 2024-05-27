package Leetcode150.Array;

public class RemoveElement {
    public static void main(String[] args){
        int[] arr = {4,2,3,6,8,3,5};
        int target = 3;
        System.out.println(removeElement(arr,target));
    }
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
