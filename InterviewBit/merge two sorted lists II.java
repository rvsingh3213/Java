

//https://www.interviewbit.com/problems/merge-two-sorted-lists-ii/

public class Solution {
    public void merge(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        int m=A.size();
            int n=B.size();
            int i=0,j=0;
        //    ArrayList<Integer> list=new ArrayList<>();
            while(i<m && j<n)
            {
                if(A.get(i)>=B.get(j))
                {
                    A.add(i,B.get(j));
                    j++; m++;
                }
                else
                {
                i++;
                    
                }
            }
        
            while(j<n)
            A.add(B.get(j++));
         
    }
        
    }

