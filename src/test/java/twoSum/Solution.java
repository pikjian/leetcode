package twoSum;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++)
        System.out.print( nums[i]+ " ");
        System.out.println();
        System.out.println(target);
        for (int i=0;i<=nums.length;i++){
            //System.out.println("i = " + i);
            for (int j=i+1;j<nums.length;j++){
                //System.out.println("j = " + j);
                if(target == nums[i]+nums[j]){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return new int[]{1,1};

    }
    public static void main (String []arg){
        int[] para1 = {1,2,4};
        List<Integer> list = new ArrayList<Integer>();
        for (int i:twoSum(para1,5)){
            list.add(i);
        }
        System.out.println(list);

    }

}

