package ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Simple {

	public static void main(String[] args) {
		
      Map<Integer, String> map= new HashMap<>();
      map.put(2, "ksjdks");
      map.put(1, "al");
      for(Map.Entry<Integer, String> entry:map.entrySet())
      {
    	  System.out.println(entry.getKey()+" yes"+entry.getValue());
      }
//		ArrayList al=new ArrayList();
//		al.add(10);
//		al.add(47);
//		al.add(28);
//		al.add(34);
//		
//		Iterator itr=al.iterator();
//		
//		while(itr.hasNext())
//		{
//			Integer a=(Integer) itr.next();
//			
//			if(a%2==0)
//			{
//				itr.remove();
//			}
//			
//		}
//		System.out.println(al);
	}

}
