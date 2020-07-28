package com.msl;

/**
 * @Author: msl
 * @CreateDate: Created in 2020/7/27 13:24 <br>
 * @Description:
 *              把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 *              输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 *              NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 *
 *              不遍历数组的条件下，寻找最小的数字，关键在于数组之间的分界点
 */
public class Demo {
    public static void main(String[] args) {
        int[] array = {3,4,5,1,2};
        int[] array2 = {1,1,1,1,0,1};
        System.out.println(minNum(array));
        System.out.println(minNum2(array2));

    }

    public static int minNum(int[] array){
        int left = 0;
        int right = array.length-1;
        if(array.length == 0){
            return 0;
        }
        if(array[left] < array[right]){
            return left;
        }
        while (left < right){
            int mid = (left+right)/2;
            //mid值大于 最右边的 说明最小的数字在mid和right之间，但不排除当前这个right就是最小的，所以移动left
            if(array[mid] > array[right]){
                left = mid+1;
            }
            //最小的数字在mid和right之间，排除了right是最小的可能，所以移动right
            else if(array[mid] == array[right]){
                right--;
            }
            //这种情况是array[mid] < array[right]
            else {
                right = left;
            }
        }
        return array[left];
    }
    public static int minNum2(int[] array){
        int min = array[0];
        if(array.length == 0){
            return 0;
        }
        if(array[0] < array[array.length-1]){
            return min;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if(array[i+1]<array[i]){
                min = array[i+1];
            }
        }
        return min;
    }
}
