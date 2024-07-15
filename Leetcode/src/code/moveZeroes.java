package code;

/**
 * ClassName: moveZeroes
 * Package: code
 * Description:
 *
 * @Author mrq
 * @Create 2024/7/15 16:57
 * @Version 1.0
 */
public class moveZeroes {
    public static void main(String[] args) {
        Solution m = new Solution();
        int[] nums1 = {1,0,2,0,1};
        m.moveZeroes1(nums1);
    }
}
class Solution{
    public void moveZeroes1(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int i = 0;
        int j = 0;
        for(i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        for(int k = j; k < nums.length; k++){
            nums[k] = 0;
        }
        for(int index = 0; index < nums.length; index++){
            System.out.println(nums[index]);
        }
    }
}

