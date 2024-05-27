package Leetcode150.Array;

public class RemoveDuplicatesII {
    public static void main(String[] args){
        int[] arr = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(arr));
    }
    static int removeDuplicates(int[] nums){
        int count= 0;
        for (int i:nums){
            if(count<2 || i!=nums[count-2]){
                nums[count]=i;
                count++;
            }
        }
        return count;
    }
}
