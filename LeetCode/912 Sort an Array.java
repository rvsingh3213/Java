class Solution {
    
    public static void sort(int arr[],int l,int r)
	{
			if(l<r)
			{	//divide array into two halfs
				int m=(l+r)/2;
				
				//calling sort on first half
				sort(arr,l,m);
				
				//calling sort on second half
				sort(arr,m+1,r);
				
				
				//merging two sorted lists
				merge(arr,l,m,r);
				
				
				
			}
	}
	
	public static void merge(int arr[],int l,int m,int r)
	{
		int n1=m-l+1;
		int n2=r-m;
		
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];

		for(int i=0;i<n1;i++)
			arr1[i]=arr[l+i];
		
		for(int i=0;i<n2;i++)
			arr2[i]=arr[m+1+i];
		
		
		int i=0,j=0;
		int k=l;
		
		while(i<n1 && j<n2)
		{
			if(arr1[i]<arr2[j])
				arr[k++]=arr1[i++];
			
			else
			{
				arr[k++]=arr2[j++];
			}
			
		}
		//put rest left part values into arr
		while(i<n1)
		{
			arr[k++]=arr1[i++];
		}
		
		//put rest right part values into arr
		while(j<n2)
		{
			arr[k++]=arr2[j++];
		}
	}
    
    public int[] sortArray(int[] nums) {
        
       sort(nums,0,nums.length -1);
        
        return nums;
    }
}