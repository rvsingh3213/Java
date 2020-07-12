
import java.io.*;
import java.util.*;
import java.lang.*;

class Codechef {
	
	static int LongestPalindromeSubsequence(String S)
	{	
		int N=S.length();
		int DP[][]=new int[N][N];
		
		for(int i=0;i<N;i++)
			DP[i][i]=1;
		
		for(int Len=2;Len<=N;Len++)
		{
			for(int i=0;i<=N-Len;i++)
			{
				int j=i+Len -1;
				
				if(S.charAt(i)==S.charAt(j)  && Len==2)
				{
					DP[i][j]=2;
				}
				else if(S.charAt(i)==S.charAt(j))
				{
					DP[i][j]=2+ DP[i+1][j-1];
				}
				else
				{
					DP[i][j]=Math.max(DP[i][j-1],DP[i+1][j]);
				}
			}
		}
		
		return DP[0][N-1];
	
		
	}
	public static void main (String[] args) throws IOException	
	{

			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			
			int test=Integer.parseInt(bf.readLine());
			
			
			while(test>0)
			{	test--;
		
				String S="BABCBAB";
				
				System.out.println(LongestPalindromeSubsequence(S));
				
			}	
	}
	
	
	
	}