package com.msl;

import java.util.Arrays;

/**
 * @Author: msl
 * @CreateDate: Created in 2020/8/3  <br>
 * @Description: TODO
 *                冒泡排序：相邻这个数进行比较，一一比较，然后交换位置，一轮比较下来后，发现一个最大的数字，位置在数组的最后
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{2,4,1,6,9,3,5,8,0};
        sort(array);
    }

    public static int[] sort(int[] array){
        //当前数组为空时
        if(array.length ==0){
            System.out.println("当前数组为空");
        }
        //第一层循环，是排序的趟数
        for (int i = 0; i < array.length-1; i++) {
            //每次排序所要进行的次数
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            System.out.println("第"+i+"躺，比较完后数组为: "+ Arrays.toString(array));
        }
        return array;
    }
}
