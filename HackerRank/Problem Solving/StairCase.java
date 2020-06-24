 
 //https://www.hackerrank.com/challenges/staircase/problem
 
 //Problem Staircase only function part
 
 // Complete the staircase function below.
    static void staircase(int n) {
        int k=1;
        for(int i=0;i<n;i++)
        {
            for(int ii=0;ii<n-k;ii++)
            System.out.print(" ");

            for(int jj=0;jj<k;jj++)
            System.out.print("#");

            k++;
            System.out.println();
        }

    }
