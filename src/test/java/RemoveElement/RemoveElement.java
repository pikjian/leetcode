package RemoveElement;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {

        int count=0;
        for (int i = 0; i < nums.length; ++i) {
            if(val != nums[i]){
              nums[count++]=  nums[i];
            }
        }
        return count;
    }
    public static void main (String [] args){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeElement(nums,1));
    }
}
