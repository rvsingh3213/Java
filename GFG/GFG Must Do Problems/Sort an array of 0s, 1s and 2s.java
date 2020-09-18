

//https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0
//change yout method accordingly


class Solution {
    public void sortMethod(int[] arr) {
        
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