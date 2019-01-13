import java.util.HashMap;
public class Solution {
    public int majorityElement(int[] nums) {
        int maxn = nums[0];
        int maxc = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            Integer t = map.get(nums[i]);
            if (t == null) t = 0;
            map.put(nums[i], t + 1);
            if (t + 1 > maxc) {
                maxc = t + 1;
                maxn = nums[i];
            }
        }
        return maxn;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().majorityElement(
                new int[] {6, 5, 5}
        ));
    }
}