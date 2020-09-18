


//https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays/0/
//Merge Without Extra Space


class Solution {
    int nextGap(int gap)
    {
        if(gap<=1)return 0;
        
        return (gap/2)+ (gap%2);
    }
    
    void merge(int arr1[], int arr2[], int n, int m) {
	  
	  int gap=n+m;
	  int i,j;
	  
	  for(gap=nextGap(gap);gap>0;gap=nextGap(gap))
	  {
	      for(i=0;i+gap<n;i++)
	      {
	          if(arr1[i]>arr1[i+gap])
	          {
	             int temp=arr1[i];
	             arr1[i]=arr1[i+gap];
	             arr1[i+gap]=temp;
	             
	          }
	      }
	      
	      for(j = gap > n ? gap - n : 0;
	      
	      j<m && i<n; i++,j++   )
	      {
	          if(arr1[i]>arr2[j])
	          {
	              int temp=arr1[i];
	              arr1[i]=arr2[j];
	              arr2[j]=temp;
	          }
	      }
	      
	      if(j<m)
	      {
	          for(j=0;j+gap<m;j++)
	          if(arr2[j]>arr2[j+gap])
	          {
	              int temp=arr2[j];
	              arr2[j]=arr2[j+gap];
	              arr2[j+gap]=temp;
	          }
	          
	      }
	     
	  }
	  
	}		//method merge() ends
    
    
}// Class Ends