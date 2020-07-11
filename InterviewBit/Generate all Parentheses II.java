

//https://www.interviewbit.com/problems/generate-all-parentheses-ii/

public class Solution {
    
    static ArrayList<String> list;
     
    static void generator(char arr[],int pos,int open,int close,int N)
		{
			if(pos==(2*N))
			{
                String s="";
				for(int i=0;i<2*N;i++)
                    s+=String.valueOf(arr[i]);
					
					s=s.trim();
				list.add(s);
				//System.out.println();
				
                
				return;
			}
			
			
			
			if(open>close)
			{
				arr[pos]=')';
				
				generator(arr,pos+1,open,close+1,N);
			}
			if(open<N)
			{
				arr[pos]='(';
				
				generator(arr,pos+1,open+1,close,N);
			}
			
			//return;

		}
    public ArrayList<String> generateParenthesis(int A) {
      Solution ss=new Solution();  
        ss.list=new ArrayList<String>();
        char arr[]=new char[2*A];
        generator(arr,0,0,0,A);
        
        Collections.sort(ss.list);
        return ss.list;
        
        
    }
}
