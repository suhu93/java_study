package com.atguiguJava.array.Leetcode;

/**
 * ClassName: MidNum
 * Package: com.atguiguJava.array.Leetcode
 * Description:
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 * 算法的时间复杂度应该为 O(log (m+n)) 。
 *二分，但是不会
 *
 * @Author mrq
 * @Create 2024/5/30 13:24
 * @Version 1.0
 */
public class MidNum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1={1,2};
        int[] nums2={3,4};
        double midnum = solution.findMedianSortedArrays(nums1,nums2);
        System.out.println(midnum);
    }
}


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        int sum = nums1.length+nums2.length;
        int[] temp = new int[sum];
        int p=0,q=0;
        int k = 0;
        while(p < nums1.length && q < nums2.length){
            if(nums1[p] < nums2[q] || nums1[p] == nums2[q]){
                temp[k++] = nums1[p++];

            }
            else{
                temp[k++] = nums2[q++];
            }
        }
        if(p == nums1.length){
            while (q < nums2.length) temp[k++] = nums2[q++];
        }
        if(q == nums2.length){
            while (p < nums1.length) temp[k++] = nums1[p++];
        }
        double midnum = 0;
        if(temp.length % 2 == 1){
            midnum = (double) temp[temp.length/2];
        }else{
            int mid = temp.length/2;
            midnum = (double) (temp[mid]+temp[mid-1])/2;
        }

        return midnum;
    }
}
