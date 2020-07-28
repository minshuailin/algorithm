package com.msl;

/**
 * @Author: msl
 * @CreateDate: Created in 2020/7/27 11:03 <br>
 * @Description: 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 *               请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("数字0是否存在："+isExistNum(null, 0));
        int[][] array = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("数字8是否存在："+isExistNum(array, 8));
        System.out.println("数字0是否存在："+isExistNum(array, 0));

        System.out.println("数字9是否存在："+isExistNum2(array, 9));
    }

    /**
     * 暴力： 循环比较这个二维数组，与期待值进行比较，只到找到这个值，返回true.
     *       时间复杂度：为 m*n(行数*列数)
     */
    public static boolean isExistNum(int[][] array, int num){
        if(array == null || array.length == 0){
            System.out.println("当前数组不存在");
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(num == array[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
    /**
     *  每一行都看成一个数组，利用二分查找，进行比较 时间复杂度： nlogn
     *  {{1,2,3},{4,5,6},{7,8,9}}
     */
    public static boolean isExistNum2(int[][] array, int num){
        for (int i = 0; i < array.length; i++) {
            int left = 0;
            int right = array[i].length-1;
            while (left<=right){
                int mid = (left+right)/2;
                if(num > array[i][mid]){
                    left = mid+1;
                }else if(num < array[i][mid]){
                    right = mid-1;
                }else {
                    return true;
                }
            }
        }
        return false;
    }
}
