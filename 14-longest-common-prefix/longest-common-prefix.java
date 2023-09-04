class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        int res=0;
        for(int i=0;i<first.length() && i<last.length();i++){
            if(first.charAt(i)==last.charAt(i))
                res=i+1;
            else
                break;
        }
        return strs[0].substring(0,res);
    }
}