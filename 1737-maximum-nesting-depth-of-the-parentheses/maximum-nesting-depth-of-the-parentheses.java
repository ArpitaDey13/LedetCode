class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int c=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)== '('){
                c++;
            }else if(s.charAt(i)== ')'){
                c--;
            }
            max=Math.max(c, max);
        }
        return max;
    }
}