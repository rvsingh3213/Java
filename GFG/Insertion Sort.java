

//https://practice.geeksforgeeks.org/problems/insertion-sort/1/
// function need to be completed int O(N) time complexity


void insert(int arr[], int i)
{
    int K=arr[i];
    
    int j=i-1;
    
    while(j>=0 && arr[j]>K)
    {
        arr[j+1]=arr[j];
        j--;
    }
    
    arr[j+1]=K;
}
