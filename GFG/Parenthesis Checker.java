

//https://practice.geeksforgeeks.org/problems/parenthesis-checker/0

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static void isBalanced(ArrayDeque<Character> stack,char arr[] )
    {
        char x,y;
        
        boolean flag=true;
        for(int i=0;i<arr.length;i++)
        {
            x=arr[i];
            
            if(x=='(' || x=='{' || x=='[' )
                {    stack.push(x);
                    continue;
                }
            
            if(stack.isEmpty())
               { System.out.println("not balanced");
                    return;
               }
            
            y=stack.pop();
            if(x=='}')
            {
                if(y=='{')
                    continue;
                else
                {
                    System.out.println("not balanced");
                    flag=false;
                    break;
                }
            }
            if(x==')')
            {
                if(y=='(')
                    continue;
                else
                {
                    System.out.println("not balanced");
                    flag=false;
                    break;
                }
            }
            if(x==']')
            {
                if(y=='[')
                    continue;
                else
                {
                    System.out.println("not balanced");
                    flag=false;
                    break;
                }
            }
        }
        
        if(flag)
        if(stack.isEmpty())
            System.out.println("balanced");
            else
            System.out.println("not balanced");

        
    }
    
    
	public static void main (String[] args)throws IOException {
	    
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            int t=Integer.parseInt(bf.readLine());

            while(t>0)
            { t--;
            
            String str=bf.readLine();
            str=str.trim();
            if(str.length()==1)
            {
                 System.out.println("not balanced");
                 continue;
            }
            char arr[]=str.toCharArray();
            ArrayDeque<Character> stack=new ArrayDeque<>();

            isBalanced(stack,arr);

            }
            
	}
}