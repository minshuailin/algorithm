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
        int[] nums2 = {9,4,9,8,4,5};

        intersect(nums1, nums2);
        intersect2(nums1, nums2);
    }

    /**
     *          数组没有顺序的情况下，在这里用到了hashmap，将数组中的数据放到map中并，记录出现的次数，
     *              然后遍历数组2，比较map中是否出现，如果出现
     *              减少map中的次数，为0是，删除map中的元素
     * @param nums1
     * @param nums2
     * @return
     */
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

    /**
     *      数组有序情况下，双指针从两个数组的起始位置进行比较，如果两个同时相等，移动指针，并加入到新数组；
     *        不相等的情况： 移动数字小的指针，在比较
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersect2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0; //指针1
        int j = 0; //指针2

        //创建新数组
        int newIndex = 0;
        ArrayList<Integer> newArray = new ArrayList<>();
        while (i < nums1.length && j < nums2.length){
            if(nums1[i] > nums2[j]){
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else {
                newArray.add(nums1[i]);
                i++;
                j++;
                newIndex++;
            }
        }

        System.out.println(newArray);
        return null;
    }
}
