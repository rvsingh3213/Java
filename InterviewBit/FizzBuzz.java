

//https://www.interviewbit.com/problems/fizzbuzz/

//FizzBuzz


public class Solution {
    public ArrayList<String> fizzBuzz(int A) {
        
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<A;i++)
		{	if((i+1)%3==0  && (i+1)%5==0)
			{arr.add("FizzBuzz");continue;}
			if((i+1)%3==0)
			{	arr.add("Fizz");continue;}
			if((i+1)%5==0)
			{	arr.add("Buzz");continue;}
			
			arr.add(String.valueOf(i+1));
		}
		
		return arr;
    }
}
