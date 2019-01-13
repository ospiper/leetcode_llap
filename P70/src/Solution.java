public class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public int climb(int startFrom, int n) {
        if (startFrom >= n) return 0;
        if (startFrom + 1 == n) return 1;
        if (startFrom + 2 == n) return 2;
        return climb(startFrom + 1, n) + climb(startFrom + 2, n);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        for (int i = 1; i < 50; i++) {
            System.out.println(i + " = " + s.climbStairs(i));
        }
    }
}
