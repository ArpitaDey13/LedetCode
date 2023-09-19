class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int arr[]=new int[m];
        for(int i=0; i<m; i++){
            int sc=0;
            for(int j=0; j<n; j++){
                if(mat[i][j] == 1){
                    sc++;
                }else{
                    break;
                }
                arr[i]=sc;
            }
        }
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            int min=Integer.MAX_VALUE;
            int index=0;
            for(int j=0;j<m;j++){
                if(arr[j]<min){
                    min=arr[j];
                    index=j;
                }
            }
            res[i]=index;
            arr[index]=Integer.MAX_VALUE;
        }
        return res;
    }
}