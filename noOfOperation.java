class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]>=k){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        
        return l;
    }
}