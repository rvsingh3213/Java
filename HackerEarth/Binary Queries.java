


//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
import java.io.*;


//import for Scanner and other utility classes
import java.util.*;
class TestClass { 

public static void main(String args[]) throws IOException
{
    BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
	StringBuilder sb=new StringBuilder();

    String s[]=br.readLine().trim().split("\\s+");
    int N=Integer.parseInt(s[0]);
    int Q=Integer.parseInt(s[1]);

    int arr[]=new int[N];
    String ss[]=br.readLine().trim().split("\\s+");
    for(int i=0;i<N;i++)
    arr[i]=Integer.parseInt(ss[i]);

    for(int i=0;i<Q;i++)
    {
        String qq[]=br.readLine().trim().split("\\s+");

        if(qq[0].equals("0"))
        {
            int index=Integer.parseInt(qq[2]);

            if(arr[index-1]==0)
            sb.append("EVEN").append("\n");
            else
            sb.append("ODD").append("\n");

        }
        else
        {    int index=Integer.parseInt(qq[1]);
            arr[index-1]=1-arr[index-1];
        }
    }

	System.out.println(sb);
}


}
