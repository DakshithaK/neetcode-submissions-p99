class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hs= new HashSet<>();
        for(int arr:nums){
            if(hs.contains(arr)){
                return true;
            }
            hs.add(arr);
        }
        return false;
        
    }
}