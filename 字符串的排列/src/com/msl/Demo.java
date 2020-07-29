package com.msl;


/**
 * @Author: msl
 * @CreateDate: Created in 2020/7/29  <br>
 * @Description: TODO
 *    题目描述：
 *        输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 *        例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 *
 *   输入描述：输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */
public class Demo {
    public static void main(String[] args) {
        String s="ABC";
        fullPermutation(s);
    }

    private static void fullPermutation(String s) {
        permutation(s.toCharArray(), 0, s.length() - 1);
    }

    private static void permutation(char[] c, int start, int end) {
        if (start == end)
            System.out.println(new String(c));

        else {
            for (int i = start; i <= end; i++) {
                if (i != start && c[i] != c[start] || i == start) {  //防止重复
                    swap(c, i, start);
                    permutation(c, start + 1, end);    //继续深度搜索
                    swap(c, i, start);
                }
            }
        }

    }

    private static void swap(char[] c, int i, int start) {
        char temp = c[i];
        c[i] = c[start];
        c[start] = temp;
    }
}
