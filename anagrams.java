import java.util.*;
class main{
    public static boolean fun(HashMap<Character,Integer> hm1,HashMap<Character,Integer> hm2) {
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
    public static void main(String args[]){
        String sa="abcdd";
        String sb="bdcda";
        HashMap<Character,Integer> hm1=new HashMap<>();
    
        
         HashMap<Character,Integer> hm2=new HashMap<>();
        for(int i=0;i<sa.length();i++){
            char ch=sa.charAt(i);
            hm1.put(ch,hm1.getOrDefault(ch,0)+1);
            
        }
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            hm2.put(ch,hm2.getOrDefault(ch,0)+1);
        }
    
       System.out.println( fun(hm1,hm2));
        
    }
}