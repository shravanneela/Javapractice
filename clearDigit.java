class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
           
            if(temp>='0'&&temp<='9'){
                st.pop();
                
            }else{
                st.push(temp);
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
         sb.reverse();
         return sb.toString();
    }
}