package selenium;

public class stringops1 {

	public static void main(String[] args)
	{
		String  course="Selenium";
		//length of the String variable
		
		int len=course.length();
		System.out.println(len);
		//to read a char in a specified index
		char s=course.charAt(4);
		System.out.println(s);
		
		String c=course.substring(2, 5);
		System.out.println(c);
	}

}
