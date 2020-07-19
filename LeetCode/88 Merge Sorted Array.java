

//https://leetcode.com/problems/merge-sorted-array/

//
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=n-1;
        int l=nums1.length;
        for(int i=l-1;k>=0;i--,k--)
        {
            nums1[i]=nums2[k];
        }
        
        Arrays.sort(nums1);
        
        
        
        for(int i=0;i<m;i++)
            System.out.print(nums1[i]+" ");
        
    }
}


/*
class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
       
// nums1 to A and nums2 to B array
        TreeMap<Integer,Integer> mp=new TreeMap<>();
        
        for(int i=0;i<m;i++)
        {
            if(mp.containsKey(A[i]))
            {
                mp.put(A[i],mp.get(A[i])+1);
            }
            else
            {
                mp.put(A[i],1);
            }
             
        }
        for(int i=0;i<n;i++)
        {
            
             if(mp.containsKey(B[i]))
            {
                mp.put(B[i],mp.get(B[i])+1);
            }
            else
            {
                mp.put(B[i],1);
            }
            
        }
        int i=0;
        for(Map.Entry<Integer,Integer> e: mp.entrySet())
        {   int k=e.getValue();
            while(k-->0)
           A[i++]=e.getKey();
            
        }
        
    }
}


*/