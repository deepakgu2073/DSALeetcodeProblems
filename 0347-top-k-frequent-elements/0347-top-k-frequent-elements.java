class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer,Integer> hsmp = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(hsmp.containsKey(nums[i])) hsmp.put(nums[i],hsmp.get(nums[i])+1);
            else hsmp.put(nums[i],1);
        }
        int i = 0;
        int[] frequencies = new int[hsmp.values().size()];
        for (Integer f: hsmp.values()){
            frequencies[i++] = f;
        }
        Arrays.sort(frequencies);
        
        i = frequencies.length-1;
        for(int j = 0; j<k; j++){
            
            for(Map.Entry<Integer,Integer> entry: hsmp.entrySet()){
                if(entry.getValue() == frequencies[i]){ 
                    ans[j] = entry.getKey();
                    i--;
                    hsmp.remove(entry.getKey());
                    break;
                }
            }
            
        }
        
        
        return ans;

    
        
    }
}