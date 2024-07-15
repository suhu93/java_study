package com.atguiguJava.array.Leetcode;

/**
 * ClassName: MaxArea
 * Package: com.atguiguJava.array.Leetcode
 * Description:
 *给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 *
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 返回容器可以储存的最大水量。
 * @Author mrq
 * @Create 2024/5/30 14:20
 * @Version 1.0
 */
public class MaxArea {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
class Solution2 {
    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                if ((maxArea/(j-i))<height[j]) {
                    maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i));
                }

            }
        }
        return maxArea;
    }
}