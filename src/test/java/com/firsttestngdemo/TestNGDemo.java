package com.firsttestngdemo;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	int a,b;

@Test
public void m1()
{
	Assert.assertEquals(20, 30);
	System.out.println("Inside method m1");
}

@Test
public void m2()
{
	System.out.println("Inside method m2");
	int a = 10/0;
}

@BeforeMethod
public void m3()
{
	a = 10; 
	b = 20;
	System.out.println("Inside method m3");
}

@AfterMethod
public void m4()
{
	System.out.println("Inside method m4");
}

@BeforeClass
public void m5()
{
	System.out.println("Inside method m5");
}

@AfterClass
public void m6()
{
	System.out.println("Inside method m6");
}

@BeforeSuite
public void m7()
{
	System.out.println("Inside method m7");
}
 
@AfterSuite
public void m8()
{
	System.out.println("Inside method m8");
}
}

 