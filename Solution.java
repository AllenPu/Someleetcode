public class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            for(int j =0;j<nums.length;j++){
                if(nums[i]+nums[j] == target )
                    System.out.println(i+" "+j);
            }
        }
        return nums;
    }
    
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        Solution so = new Solution();
        so.twoSum(nums,target);}
}



//Leetcode practice
//public int[] twoSum(int[] nums, int target) {
//    for (int i = 0; i < nums.length; i++) {
//        for (int j = i + 1; j < nums.length; j++) {
//            if (nums[j] == target - nums[i]) {
//                return new int[] { i, j };
//            }
//        }
//    }
//    throw new IllegalArgumentException("No two sum solution");
//}