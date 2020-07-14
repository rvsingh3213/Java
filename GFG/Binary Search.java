

//https://practice.geeksforgeeks.org/problems/binary-search-1587115620/1

int bin_search(int A[], int left, int right, int k)
{
    while(right>=left)
    {
         int m=left +(right -left)/2;
    
         if(A[m]==k)
         return m;
         
         if(A[m]>k)
         return bin_search(A,left,m-1,k);
         
         if(A[m]<k)
         return bin_search(A,m+1,right,k);
         
    }
    
    return -1;

}