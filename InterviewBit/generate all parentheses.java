

//https://www.interviewbit.com/problems/generate-all-parentheses/


public class Solution {
    
    static int isBalanced(ArrayDeque<Character> stack,char arr[] )
    {
        char x=arr[0];
        char y;
        for(int i=0;i<arr.length;i++)
        {
            x=arr[i];
            
            if(x=='(' || x=='{' || x=='[' )
                {    stack.push(x);
                    continue;
                }
            
            if(stack.isEmpty())
               { 
                    return 0;
               }
            
            y=stack.pop();
            if(x=='}')
            {
                if(y=='{')
                    continue;
                else
                {
                    return 0;
                   /* flag=false;
                    break;*/
                }
            }
            if(x==')')
            {
                if(y=='(')
                    continue;
                else
                {
                    return 0;
                   /* flag=false;
                    break;*/
                }
            }
            if(x==']')
            {
                if(y=='[')
                    continue;
                else
                {
                    return 0;
                   /* flag=false;
                    break;*/
                }
            }
        }
        int rt=0;
   
        if(stack.isEmpty())
            return 1;
        
		
            return 0;

    }
    public int isValid(String A) {
        
        char arr[]=A.toCharArray();
            ArrayDeque<Character> stack=new ArrayDeque<>();
            
           return isBalanced(stack,arr);
    }
}

