package Leetcode150.Array;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
    static int majorityElement(int[] nums) {
        int number = 0;
        int count = 0;
        for (int i=0;i<nums.length;i++){
            if(count==0){
                number=nums[i];
            }
            if (number==nums[i]){
                count++;
            }
            else {
                count--;
            }
        }
        return number;
    }
}
