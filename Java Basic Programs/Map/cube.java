//MapEntry will be used for Set and Iterator



import java.util.*;


class cube
{
	public static void main(String args[])
	{
		Map<Integer,String> mp=new HashMap<Integer,String>();
		
  		mp.put(1881,"rvi");
		mp.put(1875,"vikki");
		mp.put(1883,"bhuvn");
		mp.put(1850,"shiva");
	
		Set<Map.Entry<Integer,String>> st=mp.entrySet();
		Iterator<Map.Entry<Integer,String>> itr=st.iterator();

		while(itr.hasNext())
		{
		  Map.Entry e=itr.next();
		 System.out.println(e.getKey()+" "+e.getValue());
		}

	}



}