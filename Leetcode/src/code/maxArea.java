package code;

/**
 * ClassName: maxArea
 * Package: code
 * Description:
 *
 * @Author mrq
 * @Create 2024/7/15 19:27
 * @Version 1.0
 */
public class maxArea {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        System.out.println(solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
class Solution1 {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int max = 0;
        while (i < j) {
            max = Math.max(max, (j - i) * Math.min(height[i], height[j]));
            if (height[i] < height[j]) {
                i++;
            }
            else {
                j--;
            }
        }
        return max;
    }
}
