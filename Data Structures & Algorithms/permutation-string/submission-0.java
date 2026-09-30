class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s2.length()<s1.length()){
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for(char ch : s1.toCharArray()){
            count1[ch-'a']++;
        }

        int windowSize = s1.length(); //3
        //lecabee

        //first window
        for(int i=0; i<windowSize; i++){
            count2[s2.charAt(i)-'a']++;
        }

        if(Arrays.equals(count1,count2)){
            return true;
        }

        //slide the window
        for(int right = windowSize; right<s2.length(); right++){
            count2[s2.charAt(right)-'a']++;

            int left = right-windowSize;
            count2[s2.charAt(left)-'a']--;

           
            if(Arrays.equals(count1,count2)){
                return true;
            }
        }
        return false;
    }
}
