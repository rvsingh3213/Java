	import java.util.*;

class Solution {
	
		static void sub_Set(int arr[],int n,int index,int subset[],int i)
		{
			if(i==n) // if want to find subset of Size:S put (index=S)
			{
				for(int j=0;j<index;j++)
					System.out.print(subset[j]+" ");
				System.out.println("");
				
				return;
			}
			//when no more element to print
			if(i>=N)
				return;
			
			subset[index]=arr[i];
			//including element
			sub_Set(arr,n,index+1,subset,i+1);
			//excluding element
			sub_Set(arr,n,index,subset,i+1);
			
		}
		

	public static void main(String[] args) {

		int arr[]={1,2,3};
		int subset[]=new int[3];
		
		sub_Set(arr,3,0,subset,0);




	}
}