package com.orgHRM.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.exec.DaemonExecutor;

public class date {

	public static void main(String[] args) 
	{
		DateFormat dateformate=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date d=new Date();
		System.out.println(d);
		System.out.println(dateformate.format(d));
		String s=dateformate.format(d);
		
		String d1=s.replace("/", "");
		System.out.println(d1);
		
		String d2=d1.replace(" ", "");
		System.out.println(d2);
		
		String d3=d2.replace(":", "");
		System.out.println(d3);
		
		
		
		
		

	}

}
