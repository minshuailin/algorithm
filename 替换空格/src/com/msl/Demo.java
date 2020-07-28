package com.msl;

/**
 * @Author: msl
 * @CreateDate: Created in 2020/7/27 11:37 <br>
 * @Description: 请实现一个函数，将一个字符串中的空格替换成“%20”。
 *                例如，当字符串为I love you.则经过替换之后的字符串为I%20love%20You。
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(replace("I love you"));
        System.out.println(replace2("I love you"));
    }
    /**
     *  1.利用java的api replaceAll()
     */
    public static String replace(String str){

        String replace = str.replace(" ", "%20");
        return replace;
    }
    /**
     *  不使用api方法
     *  遍历字符串，替换空格为%20
     */
    public static String replace2(String str){
        StringBuilder stringBuilder = new StringBuilder();
        if(str == null ){
            return null;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                stringBuilder.append('%');
                stringBuilder.append('2');
                stringBuilder.append('0');
            }else {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
