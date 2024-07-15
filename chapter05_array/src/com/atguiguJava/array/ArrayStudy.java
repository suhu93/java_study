package com.atguiguJava.array;

/**
 * ClassName: ArrayStudy
 * Package: conm.atguigu1.one.array
 * Description:
 *
 * @Author mrq
 * @Create 2024/5/29 12:45
 * @Version 1.0
 */
public class ArrayStudy {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = new int[]{1,2,4};
        int[] a3 = new int[2];

        a2[2] = 1;

        String[] s1 = new String[2];

        for (int i = 0; i < a3.length; i++) {
            System.out.println(a3[i]);
        }
        System.out.println();

    }
}
