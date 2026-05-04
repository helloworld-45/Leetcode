class Solution {
    public String toLowerCase(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32); // convert to lowercase
            }
            result += ch;
        }
        return result;
    }
}

// Approach:
// We iterate through each character of the string.
// If the character is uppercase ('A' to 'Z'), we convert it to lowercase
// by adding 32 (ASCII difference between uppercase and lowercase).
// Otherwise, we keep the character unchanged.

// Time Complexity: O(n)
// Space Complexity: O(n)