class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set <Integer> set = new HashSet<>();
        //1,2,3,3
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }else{
                set.add(num);
            }
        }
        return false;
    }
}