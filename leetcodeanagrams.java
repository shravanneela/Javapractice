class Solution {
     public  boolean fun(HashMap<Character,Integer> hm1,HashMap<Character,Integer> hm2) {
     if(hm1.size()!=hm2.size()){
         return false;
     }
      for(char key:hm1.keySet()){
          if(!hm2.containsKey(key)){
              return false;
          }
          int a=hm1.get(key);
          int b=hm2.get(key);
          if(a!=b){
              return false;
          }
      }
      return true;
       
    }
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> hms=new HashMap<>();
    
        
         HashMap<Character,Integer> hmp=new HashMap<>();
       
        
        for(int i=0;i<p.length();i++){
            char ch=p.charAt(i);
            hmp.put(ch,hmp.getOrDefault(ch,0)+1);
        }
        List <Integer> ans=new ArrayList<>();
    
       int k=p.length();
       int n=s.length();
       int l=0;
       for(int r=0;r<n;r++){
           char ch=s.charAt(r);
           hms.put(ch,hms.getOrDefault(ch,0)+1);
          
           
           if(r-l==k){
                char chl=s.charAt(l);
            hms.put(chl,hms.get(chl)-1); 
            if(hms.get(chl)==0){
                hms.remove(chl);
            }
               l++;
           }
           if(r-l+1==k){
               boolean valid=fun(hms,hmp);
               if(valid){
                   ans.add(l);
               }
           }
           
           
           
           
           
       }
       return ans;
        
    }
}