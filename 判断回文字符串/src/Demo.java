import java.util.Arrays;

/**
 * @Author: msl
 * @CreateDate: Created in 2020/10/23  <br>
 * @Description: TODO leetcode 125
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    /**
     *      双指针法：左指针和右指针指向的字符进行比较，若字符相同则同时移动下标，若left=right,任然相等，等是回文串，若出现不相等，则不是
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                stringBuffer.append(Character.toLowerCase(c));
            }
        }
        System.out.println(stringBuffer.toString());
        int left = 0;
        int right = stringBuffer.length()-1;
        while (left < right) {
            if (Character.toLowerCase(stringBuffer.charAt(left)) != Character.toLowerCase(stringBuffer.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
