class Solution {
    public String rearrangeString(String s, char x, char y) {
   
    
        StringBuilder yPart = new StringBuilder();
        StringBuilder other = new StringBuilder();
        StringBuilder xPart = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == y) {
                yPart.append(ch);
            } else if (ch == x) {
                xPart.append(ch);
            } else {
                other.append(ch);
            }
        }

        return yPart.append(other).append(xPart).toString();
    }
}
        

    
        
