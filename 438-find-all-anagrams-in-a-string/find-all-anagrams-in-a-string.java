class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(s.length()<p.length())return ans;
        HashMap<Character, Integer> pmap= new HashMap<>(); 
        HashMap<Character, Integer> window= new HashMap<>();
        for(char el:p.toCharArray()){
            pmap.put(el,pmap.getOrDefault(el,0)+1);
        } 
        int left=0;
        for(int right=0;right<s.length();right++){
            char r=s.charAt(right);
            window.put(r,window.getOrDefault(r,0)+1);
            if((right-left+1)>p.length()){
                char l=s.charAt(left);
                window.put(l,window.get(l)-1);
                if(window.get(l)==0){
                    window.remove(l);
                }
                left++;
            }
            if(window.equals(pmap)) ans.add(left);
        }
        return ans;
    }
}