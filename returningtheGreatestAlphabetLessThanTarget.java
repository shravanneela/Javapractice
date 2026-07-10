class Main {
    public static char bs(char arr[],char target){
        int r=arr.length-1;
        int l=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>target){
                r=mid-1;
                
            }else{
                l=mid+1;
            }
        }
        return arr[r];
    }
    public static void main(String[] args) {
        char arr[]={'c','f','g','j'};
        System.out.println(bs(arr,'d'));
    }
}