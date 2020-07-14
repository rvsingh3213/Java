

//https://www.interviewbit.com/problems/remove-duplicates-from-sorted-array/
public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) {
        
      
        
       if(a.size()==1 )
        return 1;
        
     int point =1;
     int current=a.get(0);
     for(int i=0;i<a.size();i++)  
     { 
         if(!a.get(i).equals(current))
         {
             a.set((point),a.get(i));
             current=a.get(i);
             point++;
         }
     }
     
     return point;
     
    }
}
