//https://leetcode.com/problems/merge-sorted-array/submissions/1209816349/?envType=study-plan-v2&envId=top-interview-150
package Leetcode150.Array;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        int m=3;
        int n=3;
        merge(nums1,nums2,m,n);
        System.out.println(Arrays.toString(nums1));
    }
    static void merge(int[] nums1,int[] nums2,int m,int n){
        int i =m-1;
        int j=n-1;
        int k=m+n-1;
        while(j>=0){
            if (i>=0 && nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;
            }
            else {
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }
    }
}
