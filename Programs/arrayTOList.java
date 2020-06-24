import java.util.*;
import java.util.stream.*;


class test{
	/*static <T>List<T> tolist(T arr[])
	{
		List<T> list=Arrays.asList(arr);
		
		return list;
	}
	*/
	
	public static void main(String args[])
	{
		Integer arr[]={1,2,3};
		
		List<Integer> list=Arrays.asList(arr); //function can also be called here tolist(arr)
		
		
		for(Integer i:list)
		{
			System.out.println(i);
		}
	}
	
	
	
}