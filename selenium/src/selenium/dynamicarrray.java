package selenium;

public class dynamicarrray {

	public static void main(String[] args)
	{
		int[] sal=new int[10];
		
		//finding length
		
		System.out.println(sal.length);
		
		//writing the values into an array
		
		sal[4]=40000;
		sal[8]=50000;
		
		//readin the values from an array
		
		for (int i = 0; i < sal.length; i++)
		{
			System.out.println(i+"---"+sal[i]);
			
		}

		
	}

}
