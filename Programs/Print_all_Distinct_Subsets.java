


import java.io.*;
import java.util.*;
import java.lang.*;
		import java.lang.*;

		public class Solution {
						static void subSet(int arr[],int N)
						{
							
							List<String> list=new ArrayList<>();
							int size=(int)Math.pow((double)2,(double)N);
							System.out.println("size"+size);
							for(int i=0;i<size;i++)
							{	String s="";
								for(int j=0;j<N;j++)
								{
									if((i & (1 << j ))>0)
										s+=arr[j]+" ";
								}
								if(!(list.contains(s)))
								{	
									list.add(s);
								}
								
							}
							
							for(int i=0;i<list.size();i++)
							{
								String s=list.get(i);
								//System.out.println("S:");
								String str[]=s.split(" ");
								System.out.print("{ ");
								for(int j=0;j<str.length;j++)
								{   
									if(i==0)
										System.out.print(str[j]);
									else
									System.out.print(Integer.parseInt(str[j])+" ");
								}
								System.out.print(" }\n");
							}
							
						}

						
			public static void main(String[] args) {
				/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
				*/
				
				Scanner sc=new Scanner(System.in);
				
					
					int N=3;
					int arr[]={10,12,12};
					subSet(arr,N);
				
			}
		}