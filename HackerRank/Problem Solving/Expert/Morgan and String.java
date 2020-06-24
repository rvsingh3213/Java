


// Expert Problem Solving
//https://www.hackerrank.com/challenges/morgan-and-a-string/submissions


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    

   // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       Scanner sc=new Scanner(System.in);
       int test=sc.nextInt();
     
       while(test>0)
       {test--;

        String A=sc.next();
        String B=sc.next();
        
        int l1=A.length();
        int l2=B.length();

        int i=0;
        int j=0;
        StringBuffer sb=new StringBuffer();
        while(i<l1 && j<l2)
        {
            if(A.charAt(i)<B.charAt(j))
            {   sb.append(A.charAt(i));
                i++;
            }
            else if(A.charAt(i)>B.charAt(j))
            {   sb.append(B.charAt(j));
                j++;
            }
            else
            {
                int aa=i;
                int bb=j;
                char strategy=A.charAt(i);
                while(aa<l1 && bb<l2)
                {
                    if(A.charAt(aa)!=B.charAt(bb))
                    {
                        break;
                    }
                    else if(A.charAt(aa)>strategy)
                    {
                        sb.append(A.substring(i,aa)).append(B.substring(j,bb));
                        i=aa;
                        j=bb;
                        strategy=A.charAt(i);
                    }  aa++; bb++;
                }
                
               if(aa==l1)
                {
                    sb.append(B.charAt(j)); 
                    j++;                                      
                }
                else if(bb==l2)
                {
                    sb.append(A.charAt(i)); 
                    i++;
                    
                }
                else
                {   if(A.charAt(aa)<B.charAt(bb))
                    {
                     sb.append(A.charAt(i));
                        i++;
                    }
                    else
                    {
                        sb.append(B.charAt(j));
                        j++;
                    }
                }
            } // else equal ends
        } // while end
        
        sb.append(A.substring(i)).append(B.substring(j));

        System.out.println(sb);
       }// while test case ends
    
    }// main ends

}
