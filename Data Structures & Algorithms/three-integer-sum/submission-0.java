class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){

            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int start = i+1;
            int end = nums.length-1;

            while(start<end){

                int curr_sum = nums[start]+nums[end]+nums[i];

                if(curr_sum == 0){
                    res.add(Arrays.asList(nums[i],nums[start],nums[end]));

                    start++;
                    end--;

                    while(start<end && (nums[start] == nums[start-1])){
                        start++;
                    }

                    while(start<end && (nums[end] == nums[end+1])){
                        end--;
                    }
                }
                

                

                else if(curr_sum<0){
                    start++;
                }else{
                    end--;
                }

            }
        }
        return res;
    }
}
