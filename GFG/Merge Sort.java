


// merge function needed to be completed
//https://practice.geeksforgeeks.org/problems/merge-sort/1/


 void merge(int arr[], int l, int m, int r)
    {
        int n1=m-l+1;
     int n2=r-m;
     
     int arr1[]=new int[n1];
     int arr2[]=new int[n2];
     
     arr1=Arrays.copyOfRange(arr,l,m+1);
     arr2=Arrays.copyOfRange(arr,m+1,r+1);
     
     int k=l;
     int i=0;
     int j=0;
     while(i<n1 && j<n2)
     {
         if(arr1[i]<arr2[j])
         {
             arr[k++]=arr1[i++];
         }
         else
         {
             arr[k++]=arr2[j++];
         }
     }
     
     while(i<n1)
     {
          arr[k++]=arr1[i++];
     }
     
     while(j<n2)
     {
         arr[k++]=arr2[j++];
     }
     
     
    }
}
