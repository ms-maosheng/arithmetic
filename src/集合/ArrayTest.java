package 集合;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayTest {

    public static void main(String[] args) {
        int[] i = new int[]{2,1,2};
        int res = singleNumber(i);
    }


    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;j++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        int[] res = new int[list.size()];
        for(int m = 0; m < list.size(); m++){
            res[m] = list.get(m);
        }
        return res;
    }

    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res = res ^ num;
        }
        return res;
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for(int i = 0; i < nums.length; i++){
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }

    public static void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            temp[i] = nums[i];
        }
        for(int i = 0; i < temp.length; i++){
            nums[(i + k) % temp.length] = temp[i];
        }
    }

    public static int maxProfit(int[] prices) {
        int total = 0;
        for(int i = 0; i < prices.length - 1; i++){
            total += Math.max(prices[i + 1]  - prices[i], 0);
        }
        return total;
    }

    public static int removeDuplicates(int[] nums) {
        int left = 0;
        for(int right = 1; right < nums.length; right++){
            if(nums[left] != nums[right]){
                nums[++left] = nums[right];
            }
        }
        return ++left;
    }
}
