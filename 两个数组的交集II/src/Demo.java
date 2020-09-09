import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


/**
 * @Author: msl
 * @CreateDate: Created in 2020/9/8  <br>
 * @Description: TODO
 */
public class Demo {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5,4,5};
        int[] nums2 = {9,4,9,8,4};

       intersect(nums1, nums2);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<nums1.length;i++){
            map.get(nums1[i]);
            if(map.get(nums1[i]) == null){
                map.put(nums1[i],1);
            }else{
                map.put(nums1[i],map.get(nums1[i])+1);
            }
        }
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                list.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        int[] values = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            values[i] = list.get(i);

        }

        System.out.println(list);
        return  values;
    }

    public static int[] intersect2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        return null;
    }
}
