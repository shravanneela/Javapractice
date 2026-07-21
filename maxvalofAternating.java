class Solution {
    public long maximumValue(int n, int s, int m) {
      int mavlorenti = m;
        
        
        if (n == 1) {
            return s;
        }
        
        
        long maxIdx;
        if ((n - 1) % 2 == 1) {
            maxIdx = n - 1;
        } else {
            maxIdx = n - 2;
        }
        
    
        long k = (maxIdx - 1) / 2;
        
        
        long maxVal = s + k * (mavlorenti - 1) + mavlorenti;
        
        return maxVal;
    }
}