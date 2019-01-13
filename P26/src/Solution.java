public class Solution {
    public int removeDuplicates(int[] nums) {
        int cOld = 0;
        int cNew = 0;
        while (cOld < nums.length) {
//            System.out.println("old = " + cOld + ", new = " + cNew);
//            System.out.println("walking at " + cOld + ": " + nums[cOld]);
            while (cOld + 1 < nums.length && nums[cOld] == nums[cOld + 1]) ++cOld;
            nums[cNew++] = nums[cOld];
//            System.out.println("nums[" + (cNew - 1) + "] = " + nums[cOld]);
            ++cOld;
        }

//        for (int i = 0; i < cNew; ++i) {
//            System.out.println(nums[i]);
//        }
        return cNew;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(new Solution().removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
