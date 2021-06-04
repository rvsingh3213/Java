
//https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1#

class Compute {
    
    public void rotate(long arr[], long n)
    {
        long next=arr[0];
        
        for(int i=1;i<n;i++)
        {
            long temp=arr[i];
            arr[i]=next;
            next=temp;
        }
        
        arr[0]=next;
        
    }
}