class Solution {
    public int[] twoSum(int[] arr, int target) {
        for(int i = 0; i<arr.length-1; i++){
            int remaining = target-arr[i];
            int index = binarySearch(arr,remaining, i+1);
            if(index != -1) return new int[] {i+1,index+1};
            else continue;
        }
        return new int[]{-1,-1};
    }
    public static int binarySearch(int[] arr, int target, int start){
        
        int end = arr.length-1; 
        while( start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid]<target) start = mid +1;
            else if(arr[mid]>target) end = mid-1;
        }
        return -1;
    }
}