package com.msl;

/**
 * @Author: msl
 * @CreateDate: Created in 2020/11/21  <br>
 * @Description: 老师想给孩子们分发糖果，有 N 个孩子站成了一条直线，老师会根据每个孩子的表现，预先给他们评分。
 *              你需要按照以下要求，帮助老师给这些孩子分发糖果：
 *              每个孩子至少分配到 1 个糖果。
 *              相邻的孩子中，评分高的孩子必须获得更多的糖果。
 *              那么这样下来，老师至少需要准备多少颗糖果呢？
 *
 * 来源：力扣（LeetCode） 135
 * 链接：https://leetcode-cn.com/problems/candy
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Candy {
    public static void main(String[] args) {
        int[] a = {1,0,2};
        System.out.println(candy(a));
    }

    public static int candy(int[] ratings) {
        //每个孩子至少一个糖果，初始化一个数组
        int[] candys = new int[ratings.length];
        for (int i = 0; i < ratings.length; i++) {
            candys[i] = 1;
        }
        //如果右边孩子比左边孩子评分高,右边孩子的糖果+1
        for (int i = 1; i < ratings.length; i++) {
            if(ratings[i] > ratings[i-1]){
               candys[i] = candys[i-1]+1;
            }
        }

        //如果左边孩子比右边孩子评分高，左边孩子的糖果+1
        for (int i = ratings.length-2; i >= 0; i--) {
            if(ratings[i] > ratings[i+1] && candys[i]<=candys[i+1]){
                candys[i] = candys[i+1]+1;
            }
        }

        //计算糖果数
        int count = 0;
        for (int i = 0; i < candys.length; i++) {
            count += candys[i];
        }
        return count;
    }
}
