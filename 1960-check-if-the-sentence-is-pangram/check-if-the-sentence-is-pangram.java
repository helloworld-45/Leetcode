class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        for(char el:sentence.toCharArray()){
            set.add(el);
        }
        return set.size()==26 ?true : false;
    }
}