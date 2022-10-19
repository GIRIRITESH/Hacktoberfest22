//add two numbers using oop approach
import java.io.*;
import java.util.Scanner;
class Add
{
	private int a,b,c;
	void getdata(int x,int y)
	{
		a=x;
		b=y;
	}
	void addition()
	{
		c=a+b;
	}
	void print()
	{
		System.out.println("Addition of 2 numbers is: "+c);
	}
}
class add2nos
{
	public static void main(String args [])
	{
		int m,n,sum;
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first number");
			m=sc.nextInt();
			System.out.println("Enter second number");
			n=sc.nextInt();
			Add p = new Add();
			p.getdata(m,n);
			p.addition();
			p.print();
		}
		catch (Exception e)
		{
			System.out.println("Error!!");
		}
	}
}