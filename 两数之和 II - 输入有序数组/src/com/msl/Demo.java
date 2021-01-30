package com.msl;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author: msl
 * @CreateDate: Created in 2021/1/30  <br>
 * @Description: 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 *
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 *
 * 说明:
 *
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Demo {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    /**
     *   双指针法
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int sum = 0;
        while (left < right){
            sum = numbers[left]+ numbers[right];
            if(sum == target){
                break;
            }
            //原数组已排序
            if(sum < target){
                left++;
            }else {
                right--;
            }
        }
        //返回index不是从0开始的
        return new int[]{left+1,right+1};
    }

}
