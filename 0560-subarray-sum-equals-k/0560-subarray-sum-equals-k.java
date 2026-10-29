class Solution {
    public int subarraySum(int[] nums, int target) {
        // 1, 3, 5, 4, 2, 7, 0, 9, 2, 0, 6, 5, 2    k = 4
        int count = 0;

        //brute force.
        // for(int i = 0; i<nums.length; i++){
        //     for(int j = i; j<nums.length; j++){
        //         int sum = 0;
        //         for(int k = i; k<=j; k++){
        //             sum += nums[k];
        //         }
        //         if(sum == target){
        //             count ++;
        //         }
        //     }
        // }

        //optimizing the brute force slightly
        for(int i = 0; i<nums.length; i++){
            int j = i, sum = 0;
            while(j<nums.length){
                sum+=nums[j];
                if(sum==target) count++;
                j++;
            }
        }
        return count;
    }
}