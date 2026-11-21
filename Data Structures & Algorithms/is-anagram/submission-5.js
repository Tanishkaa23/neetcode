class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if(s.length != t.length){
            return false;
        }

        let freq = {}

        for(let char of s){
            freq[char] = (freq[char] || 0) + 1
        }

        for(let char of t){
            if(!freq[char]) return false

            freq[char] = freq[char] - 1
        }

        return true;
    }
}
