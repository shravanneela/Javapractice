import java.util.*;
class hello{
    public static void main(String args[]){
        int arr[]={2,4,5,6,4,3,};
        int n=arr.length;
        int l=0;
        int sl=3;
        int temp=0;
        int ans=0;
        for(int r=0;r<n-sl+1;r++){
            temp+=arr[r];
            if(r-l==sl){
                temp-=arr[l];
                l+=1;
                
            }if(r-l+1==sl){
                ans=Math.max(ans,temp);
            }
        }System.out.println(ans);
    }
}