class Solution {

    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int left = 0;
        int right = n - 1;

        while (left < right) {

            int sum = arr[left][0] + arr[right][0];

            if (sum == target) {

                int a = arr[left][1];
                int b = arr[right][1];

                if (a < b) {
                    return new int[]{a, b};
                }

                return new int[]{b, a};
            }

            else if (sum < target) {
                left++;
            }

            else {
                right--;
            }
        }

        return new int[]{};
    }
}