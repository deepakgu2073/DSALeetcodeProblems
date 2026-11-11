class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1, vol = 0, max = 0, min = 0;
        while(left<right){
            min = Math.min(height[right],height[left]);
            vol = min * (right-left);
            max = Math.max(vol,max);
            while(left<right && height[left]<=min) left++;
            while(left<right && height[right]<=min) right--;

        }
        return max;
        
    }
}