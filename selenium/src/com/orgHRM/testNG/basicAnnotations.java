package com.orgHRM.testNG;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basicAnnotations 
{
	@Test(priority=0)
	public void function1()
	{
		System.out.println("This is function1 code");
		
	}
	@Test(priority=1)
	public void function2()
	{
//		throw new SkipException("The code has not implemented for this functionality");
		System.out.println("This is function2 code");
		
	}
	@Test(priority=2)
	public void a()
	{
		System.out.println("This is a code");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("This is before method");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("This is after method");
		System.out.println("*************************");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("This is before class");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("This is afterclass");
	}
	@BeforeTest
	public void bt()
	{
		System.out.println("This is before method");
	}
	@AfterTest
	public void at()
	{
		System.out.println("This is after test");
	}
	@BeforeSuite
	public void bs()
	{
		System.out.println("This is before suite");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("This is after suite");
	}
	

}
