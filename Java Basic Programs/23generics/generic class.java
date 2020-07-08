import java.util.*;


class ravi<R> {


		<R>void arr_find(R v[])
		{
			for(R val:v)
			System.out.print(val+" ");
			System.out.println("\n");	
		
		}

	}

public class cube{

		public static void main(String args[])

		{	ravi obj=new ravi();
			Integer i_t[]={14,65,324,65,22};
						
			obj.arr_find(i_t);


			Character arr[]={'B','S','K','V','A'};
			obj.arr_find(arr);
			
		}


}