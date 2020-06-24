
https://www.hackerrank.com/challenges/pairs/problem

Pairs

// Only Function need to be build
public class Solution {

    // Complete the pairs function below.
    static int pairs(int k, int[] arr) {
        int len=arr.length;
        Arrays.sort(arr);

        int count=0;

        for(int i=0;i<len-1;i++)
        {   for(int j=i+1;j<len;j++)
           {    if( (arr[j]-arr[i])>k )
                    break;
                if( (arr[j]-arr[i])==k )
                    count++;
           }
        }


    return count;
    }
	
	//Main method
	
}