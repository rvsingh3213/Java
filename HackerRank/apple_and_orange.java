Apple and oranges


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

     
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int m=apples.length;
		int n=oranges.length;
		int apple_count=0;
		int orange_count=0;
	 for(int i=0;i<m;i++)
	 {	apples[i]+=a; 
		if(apples[i]>=s && apples[i]<=t)
			apple_count++;
	 }
	 for(int i=0;i<n;i++)
	 { oranges[i]+=b;
		if(oranges[i]>=s && oranges[i]<=t)
			orange_count++;
	 }
	 System.out.println(apple_count+"\n"+orange_count);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split( );

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split( );

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split( );

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split( );
        scanner.skip((rn[nru2028u2029u0085]));

        for (int i = 0; i  m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split( );
        scanner.skip((rn[nru2028u2029u0085]));

        for (int i = 0; i  n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}
