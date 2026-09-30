class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        let map = new Map()

        for(let num of nums){
            if(map.has(num)){
                map.set(num,map.get(num)+1)
            }else{
                map.set(num,1)
            }
        }

        for(let [key,val] of map){
            if(val>1){
                return true
            }
        }

        return false

        
    }
}
