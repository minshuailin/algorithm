package com.msl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: msl
 * @CreateDate: Created in 2020/7/28 16:18 <br>
 * @Description: TODO
 *               数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 *              例如：输入如下所示的一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
 *               超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class Demo {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,2,2,2,5,4,2};
        //System.out.println(getNum(array));
        int[] array2 = new int[]{1,2,3,2,2,3,3,3,3,2};
        // 1 2 2 2 3 3 3 3 3
        //System.out.println(getNum(array2));

        //System.out.println(getNum2(array));
        System.out.println(getNum3(array));
    }
    /**
     *  中位数解法，先将数组排序，统计中位数出现的次数
     * */
    public static int getNum(int[] array){
        Arrays.sort(array);
        int mid = array[(array.length-1)/2];
        int count = 0;
        if(array.length==0){
            return 0;
        }
        for (int i = 0; i < array.length; i++) {
            if(mid == array[i]){
                count++;
            }
        }
        if(count > array.length/2){
            return mid;
        }
        return 0;
    }
    /**
     *  遍历数组，统计每一个数字出现的次数,利用hashmap存储信息，这样在查找的时候时间复杂度为O(1),空间复杂度为O(n)
     *          key：当前数字
     *          value:当前数字出现的次数
     * */
    public static int getNum2(int[] array){
        if(array.length == 0 || array == null){
            return 0;
        }
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {

            if(hashMap.containsKey(array[i])){
                hashMap.put(array[i],hashMap.get(array[i])+1);
            }else {
                hashMap.put(array[i],1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() > array.length/2){
                return entry.getKey();
            }
        }
        return 0;
    }
    /**
     *      数字出现次数大于数组长度的一半，说明该数字的出现的次数比剩下数字出现的次数之后都多
     * */
    public static int getNum3(int[] array){
        if(array.length == 0){
            return 0;
        }
        int result = array[0];//数组第一个数，作为起始值
        int count = 1;//记录出现的次数

        //碰见相同的数字，count++，不同的count--
        for (int i = 1; i < array.length; i++) {
            if(array[i] == result){
                count++;
            }else {
                count--;
            }
            //次数等于0，说明之前遇到的不同和相同的数字抵消了,重新设置result,count置为1
            if(count == 0){
                result = array[i];
                count = 1;
                continue;
            }
        }
        //判断是否符合条件
        count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == result){
                count++;
            }
            if(count > array.length/2){
                return result;
            }
        }

        return 0;
    }
}
