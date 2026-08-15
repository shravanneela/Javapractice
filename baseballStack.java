class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String s=operations[i];
            if(s.equals("C")){
                st.pop();
            }else if(s.equals("D")){
                int t1=st.peek();
                int ans=2*t1;
                st.push(ans);
            }else if(s.equals("+")){
                int t2=st.pop();
                int t1=st.peek();
                int temp=t1+t2;
                st.push(t2);
                st.push(temp);
            }else{
                st.push(Integer.valueOf(s));
            }
        }
        int total=0;
        for(int i:st){
            total+=i;
         }
         return total;
    }
}