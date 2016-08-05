package selenium;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args)
	{
		ArrayList<Object> x=new ArrayList<Object>();
		
		//writing data into arraylist
		
		x.add("Selenium");
		x.add("Qtp");
		x.add("CodedUI");
		x.add("Selenium");
		
		
		//finding the length of an array
		
		System.out.println(x.size());
		
		//read the values from array
		
		for (int i = 0; i < x.size(); i++) 
		{
			System.out.println(x.get(i));
			
			
		}

	}

}
