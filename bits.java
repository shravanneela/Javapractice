class Solution {
    public int countBits(int n){
        int count=0;
        while(n>0){
            count+=n%2;
            n/=2;
        }
        return count;
    }
    public int[] sortByBits(int[] arr) {
       for(int i=0;i<arr.length-1;i++){
        for(int j=i+1;j<arr.length;j++){
            int  bits1=countBits(arr[i]);
            int bits2=countBits(arr[j]);
            if(bits1>bits2||(bits1==bits2&&arr[i]>arr[j])){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
       }
       return arr;
    }
}