package com.msl;

/**
 * @Author: msl
 * @CreateDate: Created in 2020/7/27 14:15 <br>
 * @Description:
 * 　        输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 *          并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Demo {
    public static void main(String[] args) {
        int[] array = {3,4,5,1,2};
        reOrderArray(array);
    }
    public static void reOrderArray(int [] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1-i; j++) {
                if ((array[j] % 2 == 0) && (array[j + 1] % 2) != 0) {
                    //前偶后奇则交换
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
