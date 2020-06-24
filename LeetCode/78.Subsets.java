import java.util.*;
import java.io.*;
import java.lang.*;
class Solution {
/*    Static int length=0;
    Static int size=0;
    
*/
 public static void subArr(int arr[],int N,int sub[],int i,int index,List<List<Integer>> al)
    {
        if(i==N)
			{	
			    ArrayList<Integer> ls=new ArrayList<>();
                for(int ii=0;ii<index;ii++)
                    ls.add(sub[ii]);
                al.add(ls);
            }   
			
			if(i>=N)
				return;
			
			sub[index]=arr[i];
			
			//includeing element
			subArr(arr,N,sub,i+1,index+1,al);
			
			//excluding element
			subArr(arr,N,sub,i+1,index,al);
			
    }
    public List<List<Integer>> subsets(int[] nums) {
       int N=nums.length;
        int size=(int)Math.pow(2,N);
        List<List<Integer>> al=new ArrayList<List<Integer>>(size);
        
        int sub[]=new int[N];
        subArr(nums,N,sub,0,0,al);
       // System.out.println("do it");
        
        
        return al;
    }
}