package selenium;

public class twodimentional 
{

	public static void main(String[] args) 
	{
		Object[][] s=new Object[2][3];
		
		
		//length of the rows
		System.out.println(s.length);
		
		//finding the columns length
		
		System.out.println(s[0].length);
		
		
		//writing the data into array
		
		//1 row
		s[0][0]=30000;
		s[0][1]="Selenium";
		s[0][2]="Hiren";
		
		//2 row
		
		s[1][0]='M';
		s[1][1]=44.44;
		s[1][2]=true;
		
		
		//reading the values from array
		
		System.out.println(s[1][1]);
		
		for (int i = 0; i < s.length; i++)
		{
			for (int j = 0; j < s[i].length; j++)
			{
				System.out.println(s[i][j]);
				
			}
			
		}
		

	}

}
