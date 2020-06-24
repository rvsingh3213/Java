import java.io.*;
import java.util.*;

class Solution{
	
	public static void main(String[] arg) 
    { 
        ArrayList<String> arr = new ArrayList<String>(); //same can be used to convert vector to list
        arr.add("ravi"); 
        arr.add("sher"); 
        arr.add("singh"); 
        arr.add("singh"); 
  
        // createn default vector 
        Vector<String> v = new Vector<String>(arr); 
  
        // copying all element of array list int0 vector 
        //v.addAll(1,arr); 
  
        // checking vector v 
        System.out.println("vector v:" + v); 
    } 
}