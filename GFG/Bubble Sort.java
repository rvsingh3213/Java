

//Only needed to complete this function
//https://practice.geeksforgeeks.org/problems/bubble-sort/1


	static void bubble(int arr[], int i, int n)
    {
       // add your code here
       
       for(int j=0;j<n-1-i;j++)
       {
           if(arr[j]>arr[j+1])
           {
               int temp=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp;
           }
       }
    }