class Solution {
    public int maxProduct(int n) {
        int largestdigit=0;
        int secondlargestdigit=0;
        
        while(n>0){
            int currdigit=n%10;
            if(currdigit>largestdigit){

               secondlargestdigit=largestdigit;
               largestdigit=currdigit ;
            }
            else if(currdigit>secondlargestdigit){
              secondlargestdigit=currdigit;
        }
        n=n/10;
        }
        return largestdigit*secondlargestdigit;
    }
    
}