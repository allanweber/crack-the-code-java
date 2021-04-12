public class SingleNumber {
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?
//
//Example 1:
//Input: nums = [2,2,1]
//Output: 1

//Example 2:
//Input: nums = [4,1,2,1,2]
//Output: 4

//Example 3:
//Input: nums = [1]
//Output: 1

    public static void main(String[] args) {
        System.out.println(new SingleNumber().singleNumber(new int[]{4,1,2,1,2}));
    }

    public int singleNumber(int[] nums) {
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;
    }
}
