package selenium;

public class nestedif {

	public static void main(String[] args)
	{
		int a=13000;
		int b=1500;
		int c=800000;
		
		if (a>b & a>c)
		{
			System.out.println("A is greater");
		}
		else if (b >c & b>a)
		{
			System.out.println("B is greater");
		}
		else
		{
			System.out.println("C is greater");
		}
		
				

	}

}
