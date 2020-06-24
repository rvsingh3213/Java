
// It will have Complexity O(N Square)
//Better version will be if used HashMap to print unique Values.


import java.io.*;
import java.util.*;
import java.io.*;
		import java.lang.*;

		public class Solution {

			public static void main(String[] args) {
				/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
				*/
				
				Scanner sc=new Scanner(System.in);
				
					
					int N=10;
					int arr[]={2,5,3,4,2,3,3,10,33,4};
					int flag=1;
					for(int i=0;i<N;i++)
					{	flag=1;
						for(int j=0;j<i;j++)
						{	if(i==0)
							System.out.println(" rrrr");
							if(arr[i]==arr[j])
							{	flag=0;
								break;
							}
							
						}
						if(flag==1)
							System.out.print	(arr[i]+" ");
					}
				
			}
		}