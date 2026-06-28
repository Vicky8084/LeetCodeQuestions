class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {

        int n = nums.length;
        int[] ans = new int[n - k + 1];

        int[] freq = new int[101];

        // First window
        for (int i = 0; i < k; i++) {
            freq[nums[i] + 50]++;
        }

        ans[0] = findBeauty(freq, x);

        int idx = 1;

        for (int i = k; i < n; i++) {

            freq[nums[i - k] + 50]--;

            freq[nums[i] + 50]++;

            ans[idx++] = findBeauty(freq, x);
        }

        return ans;
    }

    private int findBeauty(int[] freq, int x) {

        int count = 0;

        for (int value = -50; value < 0; value++) {

            count += freq[value + 50];

            if (count >= x)
                return value;
        }

        return 0;
    }
}