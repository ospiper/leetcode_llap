public class Solution {
    public int removeElement(int[] nums, int val) {
        int ret = nums.length;
        int prev = 0;    // numbers of continuous repeat elements
        for (int i = 0; i < ret; ++i) {
            if (nums[i] == val) {
//                System.out.println("Find: " + i);
                prev = 1;
                for (int j = i + 1; j < ret; ++j) {
                    if (nums[j] == val) ++prev;
                    else break;
                }
//                System.out.println("Prev: " + prev);
                for (int j = i + prev; j < ret; ++j) {
                    nums[j - prev] = nums[j];
                }
                ret -= prev;
//                System.out.println("ret: " + ret);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().removeElement(
                new int[] {0,1,2,2,3,0,4,2},
                2
        ));
    }
}
