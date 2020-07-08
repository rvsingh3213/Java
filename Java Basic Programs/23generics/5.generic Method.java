// A class that can refer to any type is called generic class

import java.util.*;




public class cube
{

public static <E>void printarr(E[] elements)
{	
	for(E ar:elements)
	
	System.out.println(ar);
}

public static void main(String args[])
{
Integer arr1[]={10,11,12,15,17};
Character arr2[]={'A','B','C','D','E','F'};
System.out.println("Int arr:");
printarr(arr1);

System.out.println("char arr:");
printarr(arr2);

}


}