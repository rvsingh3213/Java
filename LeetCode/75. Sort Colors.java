

//https://leetcode.com/problems/sort-colors/
//75. Sort Colors


class Solution {
    public void sortColors(int[] arr) {
        
        int n=arr.length;
        
        int k=0,j=n-1;
        int i=0;
        while(i<=j)
        {
            if(arr[i]==0)
            {
                int temp=arr[k];
                arr[k]=arr[i];
                arr[i]=temp;
                i++;
                k++;
            }
            else if(arr[i]==2)
            {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                
                j--;
            }
            else
                i++;
            
        }
        
    }
}