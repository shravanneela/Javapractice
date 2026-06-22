import java.util.*;
class main{
    public static boolean fun(HashMap<Integer,Integer> hm1,HashMap<Integer,Integer> hm2) {
     if(hm1.size()!=hm2.size()){
         return false;
     }
      for(int key:hm1.keySet()){
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
        HashMap<Integer,Integer> hm1=new HashMap<>();
        hm1.put(3,129);
        hm1.put(6,100);
         HashMap<Integer,Integer> hm2=new HashMap<>();
        hm2.put(3,129);
        hm2.put(6,100);
       System.out.println( fun(hm1,hm2));
        
    }
}