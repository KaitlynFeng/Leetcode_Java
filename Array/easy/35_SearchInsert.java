class Solution {
    public int searchInsert(int[] nums, int target) {
        int mid = 0; //the edge case
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
            if (left == right){
                if (target <= nums[left]){
                    return left;
                }else{
                    return left + 1;
                }
            }
        }
        if (left>0){
            return left;
        }else{
            return 0;
        }

    }

}