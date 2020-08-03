package com.msl;

import java.util.Arrays;

/**
 * @Author: msl
 * @CreateDate: Created in 2020/8/3  <br>
 * @Description: TODO
 *               快速排序的思想在于，在数组中找一个基准数，然后从数组的两端，扫描这个数组，比这个基准数大的放到右边，比这个基准数小的放到左边
 *               重复这个过程
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {2,4,1,6,9,3,5,8,0};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    public static void quickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp就是基准位
        temp = arr[low];

        while (i<j) {
            //先看右边，依次往左递减,找一个比基准数小的
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增,找一个比基准数大的
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        //最后将基准为与i和j相等位置的数字交换,即i=j这个位置的时候
        arr[low] = arr[j];
        arr[j] = temp;
        //递归调用左半数组
        quickSort(arr, low, j-1);
        //递归调用右半数组
        quickSort(arr, j+1, high);
    }

}
