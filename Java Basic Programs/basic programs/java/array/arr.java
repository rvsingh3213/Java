
	import java.util.Scanner;

class arr
{ 
//array 2nd prog

 public static void main(String arg[])

{ int [][]a=new int[3][3];
  int i,j,s=0;

Scanner sc=new Scanner(System.in);

System.out.println("Enter 3*3 Array Elements:\n");


	for(i=0;i<3;i++)
 	
	     {	System.out.println("Enter"+(i+1) +"Row Elements:");
	          for(j=0;j<3;j++)
                { 
						//elements taken
			a[i][j]=sc.nextInt();
       
		}   
	      }

	
	for(i=0;i<3;i++)
         {	
		s=s+a[i][0];

	 	if(i==2)
		{
			for(j=1;j<3;j++)
			s=s+a[i][j];

		}
	 }

System.out.println("\n\nThe Total Sum is:"+s);


sc.close();



}

}