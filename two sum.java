Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109

class Solution {
    public int[] twoSum(int[] nums, int target) {

     int a=0;
     int b=nums.length-1;
     while(a>b)
     {
        int sum=nums[a]+nums[b];
        if(sum==target){
            return new int[]{a,b};
        }else if(sum<target){
            b--;
        }else{
                a++;
        }
     }
     return new int[]{};}} 

this is just a function 

  // Simple Two Sum using Two Pointers
// Note: Works correctly if the array is sorted

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int a = 0;                  // left pointer
        int b = nums.length - 1;    // right pointer

        // Loop until pointers meet
        while (a < b) {  // ✅ fixed condition
            int sum = nums[a] + nums[b];

            if (sum == target) {
                // Found the two numbers
                return new int[]{a, b};
            } 
            else if (sum > target) {
                // If sum is too big, move right pointer left
                b--;
            } 
            else {
                // If sum is too small, move left pointer right
                a++;
            }
        }

        // No pair found
        return new int[]{};
    }

    // Just for testing
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = s.twoSum(nums, target);
        if (result.length > 0) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found!");
        }
    }
}
