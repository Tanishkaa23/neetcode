class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        let map = new Map()

        for(let i=0; i<strs.length; i++){
            let sortedStr = strs[i].split('').sort().join('')

            if(map.has(sortedStr)){
                map.get(sortedStr).push(strs[i])
            }
            else{
                map.set(sortedStr,[strs[i]])
            }
        }
        return Array.from(map.values())
    }
}
