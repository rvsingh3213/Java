

	//https://leetcode.com/problems/generate-parentheses/


	class Solution {
		static void generator(char arr[],int pos,int open,int close,int N,List<String> list)
			{
				if(pos==(2*N))
				{
					String s="";
					for(int i=0;i<2*N;i++)
						s+=String.valueOf(arr[i]);
						//System.out.print(arr[i]);
					list.add(s);
					System.out.println();
					
					
					return;
				}
				
				
				
				if(open>close)
				{
					arr[pos]=')';
					
					generator(arr,pos+1,open,close+1,N,list);
				}
				if(open<N)
				{
					arr[pos]='(';
					
					generator(arr,pos+1,open+1,close,N,list);
				}
				
				//return;

			}
		public List<String> generateParenthesis(int n) {
			
			List<String> list=new ArrayList<>();
			char arr[]=new char[2*n];
			generator(arr,0,0,0,n,list);
			
			
			return list;
		}
	}