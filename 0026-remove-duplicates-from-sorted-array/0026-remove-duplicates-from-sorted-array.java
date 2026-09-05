
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int prev = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num != prev) {
                nums[k] = num;
                k++;
                prev = num;
            }
        }

        return k;
    }
}
