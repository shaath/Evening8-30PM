package selenium;

public class switchcase {

	public static void main(String[] args)
	{
		String course="manual";
		
		switch (course)
		{
		case "Selenium":
			System.out.println("You are selected selenium");
			break;
			
		case "Qtp":
			System.out.println("You are seleced Qtp");
			break;
		case "Loadrunner":
			System.out.println("You are selected Loadrunner");
			break;
		default:
			System.out.println("Select a proper option");
			break;
		}

	}

}
