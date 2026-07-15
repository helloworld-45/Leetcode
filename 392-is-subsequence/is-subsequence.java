class Solution {
    public boolean isSubsequence(String s, String t) {
        int start=0;
        for(int i=0;i<s.length();i++){
            int flag=0;
            for(int j=start;j<t.length();j++){
                if(t.charAt(j)==s.charAt(i)){
                    flag=1;
                    start=j+1;
                    break;
                }
            }
            if(flag==0)return false;
        }
        return true;
    }
}
