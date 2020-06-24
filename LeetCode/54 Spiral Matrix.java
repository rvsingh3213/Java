class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        
        if(matrix.length==0)
            return list;
        int M=matrix.length;
        int N=matrix[0].length;
        
            int SR=0;	// Start Row
			int ER=M-1;	// End Row
			int SC=0;	//Start Col
			int EC=N-1; //End Col
        
        while((SR<=ER) && (SC<=EC) )
			{
				for(int i=SC;i<=EC;i++)
					{	list.add(matrix[SR][i]);                        
					}
					SR++;
					//System.out.println("R1 done");
				for(int i=SR;i<=ER;i++)
					{	list.add(matrix[i][EC]);						
					}
				EC--;
				
				
				//System.out.println("R2 done");
				if(SR<=ER)
				for(int i=EC;i>=SC;i--)
				{	list.add(matrix[ER][i]);                    
				}
				ER--;
				//System.out.println("R3 done");
				if(SC<=EC)
				for(int i=ER;i>=SR;i--)
				{   list.add(matrix[i][SC]);					
				}
				SC++;
				//System.out.println("R4 done");
				
				
			}
        
        
        
        return list;
            
        
    }
}