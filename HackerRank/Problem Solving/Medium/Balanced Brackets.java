
//https://www.hackerrank.com/challenges/balanced-brackets/problem

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    /*static void search(Stack<String> stk,String element)
    {
        System.out.println(stk.search());
    }*/
    
  static void isBalanced(ArrayDeque<Character> stack,char arr[] )
    {
        char x=arr[0];
        char y;
        boolean flag=true;
        for(int i=0;i<arr.length;i++)
        {
            x=arr[i];
            
            if(x=='(' || x=='{' || x=='[' )
                {    stack.push(x);
                    continue;
                }
            
            if(stack.isEmpty())
               { System.out.println("NO");
                    return;
               }
            
            y=stack.pop();
            if(x=='}')
            {
                if(y=='{')
                    continue;
                else
                {
                    System.out.println("NO");
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
                    System.out.println("NO");
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
                    System.out.println("NO");
                    flag=false;
                    break;
                }
            }
        }
        
        if(flag)
        if(stack.isEmpty())
            System.out.println("YES");
            else
            System.out.println("NO");

        
    }
    public static void main (String[] args) throws IOException    
    {

            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            int t=Integer.parseInt(bf.readLine());

            while(t>0)
            { t--;
            String str=bf.readLine();
            str=str.trim();
            if(str.length()==1)
            {
                 System.out.println("NO");
                 continue;
            }
            char arr[]=str.toCharArray();
            ArrayDeque<Character> stack=new ArrayDeque<>();

            isBalanced(stack,arr);

            }
            
    }
    
    
}


