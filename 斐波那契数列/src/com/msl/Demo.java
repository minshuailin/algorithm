package com.msl;

/**
 * @Author: msl
 * @CreateDate: Created in 2020/7/29  <br>
 * @Description: TODO
 *          斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。假设n<=39。
 *          斐波那契数列：0,1,1,2,3,5,8........ 总结起来就是：第一项是0，第二项是1，后续第n项为第n-1项和第n-2项之和。
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(Fibonacci(3));
        re(3);
    }
    public static int Fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }

    public static void re(int n){
        int temp = n;
        //System.out.println("递进"+temp);
        if(n>0){
            re(--n);
        }
        System.out.println("回归"+temp);
    }
}
