class Solution {
    public int maxVowels(String s, int k) {
        int left=0;
        int count=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            if(isvowel(s.charAt(right))) count++;
            if((right -left +1)>k){
                if(isvowel(s.charAt(left)))count--;
                left++;
            }
            if((right-left+1)==k){
                max=Math.max(max,count);
            }
        }
        return max;
    }
    public boolean isvowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }

}
/*
 * Sliding Window:
    Instead of counting vowels for every substring, maintain the vowel count
    of the current window. As the window moves, add the new character if it's
    a vowel and remove the leftmost character if it leaves the window. Update
    the maximum vowel count whenever the window size becomes k.
 */