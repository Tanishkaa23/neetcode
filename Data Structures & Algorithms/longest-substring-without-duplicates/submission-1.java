class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for(int moving = 0; moving<s.length(); moving++){


            while(set.contains(s.charAt(moving))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(moving));

            maxLength = Math.max(maxLength, moving-left+1);


        }

        return maxLength;
    }
}
