
//https://www.hackerrank.com/challenges/counting-valleys/problem


// Solution for Counting Valleys

 // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

        int l=s.length();
        int U=0;
        int flag_down=0;
        int count=0;
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)=='U')
            {   
                U++;
                 
            }
            else 
            {   if(U==0)
                count++;

                U--;
            }

        }
return count;   
    }