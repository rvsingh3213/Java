

//
//
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(br.readLine().trim());
        int max=0;
        HashMap<String,Integer> mp=new HashMap<>();
        while(N-->0)
        {
            String str[]=br.readLine().trim().split("\\s+");

            for(int i=0;i<2;i++)
            {
                if(mp.containsKey(str[i]))
                {
                    mp.put(str[i],mp.get(str[i])+1);
                    max=Math.max(max,mp.get(str[i]));
                }
                else
                {
                    mp.put(str[i],1);
                }
            
            }

        }
        ArrayList<String> list=new ArrayList<>();
        for(Map.Entry<String,Integer> e:mp.entrySet())
        {
            if(e.getValue()==max)
            list.add(e.getKey());
        }
    Collections.sort(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++)
        System.out.println(list.get(i));

    }
}
