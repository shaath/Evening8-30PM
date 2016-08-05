package day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset {

	public static void main(String[] args) 
	{
		Set<String> s=new HashSet<String>();
		
		s.add("Selenium");
		s.add("Uft");
		s.add("Selenium");
		s.add("Apple");
		Iterator<String> it=s.iterator();
		
		while (it.hasNext()) 
		{
			String x=it.next();
			System.out.println(x);
			
		}
		
		
		
		
		
		

	}

}
