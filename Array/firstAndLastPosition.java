package Array;

public class firstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        int lo = 0, hi = nums.length - 1;
        if (nums.length == 0) {
            return ans;
        }
        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (nums[mid] == target) {
                ans[0] = mid;
                // continue searching in left hand side
                hi = mid - 1;
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        lo = 0;
        hi = nums.length - 1;

        // to find first index
        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (nums[mid] == target) {
                ans[1] = mid;
                // continue searching right part
                lo = mid + 1;
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }
}
