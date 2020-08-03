package com.msl;

import java.util.Arrays;

/**
 * @Author: msl
 * @CreateDate: Created in 2020/8/3  <br>
 * @Description: TODO
 *                  选择排序的思想，每一次循环数组，都将最大的或者最小的一个数放到数组的末尾，直到全部待排序的数据元素排完
 *
 */
public class Selectsort {
    public static void main(String[] args) {
        int[] array = {2,4,1,6,9,3,5,8,0};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void sort(int[] array){
        int max;

        for (int i = 0; i < array.length - 1; i++) {
            max = 0;
            for (int j = 0; j < array.length - i; j++) {
                if(array[j] > array[max]){
                    max = j;
                }
            }
            //找到数组中最大的元素，与数组最后一位元素交换
            int temp = array[max];
            array[max] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
    }
}
