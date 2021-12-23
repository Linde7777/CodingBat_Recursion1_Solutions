public class Array220 {
    public boolean array220(int[] nums, int index) {
        if (index == nums.length - 1 || index == nums.length) {
            return false;
        }

        if (nums[index] == nums[index + 1] / 10 && nums[index + 1] % 10 == 0) {
            return true;
        } else {
            return array220(nums, index + 1);
        }

    }

}
