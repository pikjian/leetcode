package RemoveDuplicates;

import com.sun.deploy.util.ArrayUtil;
import sun.rmi.runtime.NewThreadAction;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        List<Integer> temp = new ArrayList();
        List<Integer> newNum = new ArrayList();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                temp.add(nums[j]);
            }
            if (temp.contains(nums[i])) {
                temp.clear();
            } else {
                newNum.add(nums[i]);
                temp.clear();
            }

        }

        int[] arr = new int[newNum.size()];
        for(int i = 0; i < newNum.size(); i++) {
            arr[i] = newNum.get(i);
        }
        System.out.println(newNum);
        for (int x : arr)
            System.out.print(x + " ");

        return arr.length;
    }
    public static void main (String [] args){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
    }
}
