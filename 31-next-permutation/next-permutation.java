class Solution {
    public void nextPermutation(int[] a) {
        int n=a.length;
        int i=n-2;
        while(i>=0 && a[i]>=a[i+1])
            i--;
        if(i>=0){
            int j=n-1;
            while(j>=0 && a[j]<=a[i])
                j--;
            swap(a,i,j);
        }
        reverse(a,i+1);
    }
    public void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public void reverse(int a[], int i){
        int j=a.length-1;
        while(i<j){
            swap(a,i,j);
            i++;
            j--;
        }
    }
}