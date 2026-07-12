class Solution {
    public static int LeftMost(int[] nums,int target){
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]>=target){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        if(l>=nums.length){
            return -1;
        }
        if(nums[l]!=target){
            return -1;
        }
        return l;
    }

    public static int RightMost(int[] nums, int target){
         int l=0;
        int r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(nums[m]>target){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        if(r<0){
            return -1;
        }
        if(nums[r]!=target){
            return -1;
        }
        return r;
    }
    public int[] searchRange(int[] nums, int target) {
        int lm=LeftMost(nums, target);
        int rm=RightMost(nums, target);
        int ans[]={lm,rm};
        return ans;
        
    }
}