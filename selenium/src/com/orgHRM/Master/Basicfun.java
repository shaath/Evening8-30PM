package com.orgHRM.Master;

public class Basicfun 
{
	public static void main(String[] args) 
	{
		function1();
		String res=function2();
		System.out.println(res);
		
		Basicfun f=new Basicfun();
		f.function3();
		
		res=f.function4();
		System.out.println(res);
		
	}
	
	//static function without returning values
	
	public static void function1()
	{
		System.out.println("This is function1 code");
	}
	//static function with returning values
	
	public static String function2()
	{
		System.out.println("This is function2 code");
		
		return "Pass";
	}
	
	//non static function without returning anyvalue
	
	public void function3()
	{
		System.out.println("This is function3 code");
	}
	
	//non static function with returning values
	public String function4()
	{
		System.out.println("This is function4 code");
		return "Fail";
	}

}
