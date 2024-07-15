package com.atguiguJava.array;

/**
 * ClassName: TwoArrayTest
 * Package: conm.atguigu1.one.array
 * Description:
 *
 * @Author mrq
 * @Create 2024/5/29 14:13
 * @Version 1.0
 */
public class TwoArrayTest {
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{1},{2,1}};

        double[][] d1 = new double[2][];
        d1[0] = new double[]{1,2,3};
        int[] arr2 = {1,2,3,4};
        String[][] str1 = new String[5][];
        str1[0]=new String[3];
        str1[0][2] = "dfsfs";
        System.out.println(arr1[1].length);
    }
}
