class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[]freq= new int[26];
        for(char ch: magazine.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch: ransomNote.toCharArray()){
            freq[ch-'a']--;
            if(freq[ch-'a']<0){
                return false;
            }
        }
        return true;
    }
}
// Approach: Initialize a frequency array of size 26 to store the count of each lowercase letter. Traverse the magazine string and update the frequency of every character. Then, traverse the ransomNote string and decrement the corresponding frequency. If any frequency becomes negative, return false since the required character is unavailable. If the traversal completes successfully, return true.
