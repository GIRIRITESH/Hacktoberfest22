import java.util.*;

import My_Pack.addition;
import My_Pack.subtraction;
import My_Pack.multiplication;
import My_Pack.division;
import My_Pack.cube;

class Lab9q6{
	public static void main(String args[]){
		
		double a,b;
		char c;
		
		Scanner sc=new Scanner(System.in);
		
		addition a=new Scanner addition();
		subtraction s=new subtraction ();
		multiplication m=new multiplication ();
		division d=new division ();
		cube cb=new cube ();
		
		System.out.println("Enter the operator : + - * / ^");
		c = sc.next().charAt(0);
		System.out.println("Enter the numbers : ");
		
		switch(c){
			
			case '+' :
			a = sc.nextDouble();
			b = sc.nextDouble();
			System.out.println("Addition : "+a.sum(a,b));
			break;
			
		    case '-' :
			a = sc.nextDouble();
			b = sc.nextDouble();
			System.out.println("Subtraction : "+s.subtract(a,b));
			break;
			
			case '*' :
			a = sc.nextDouble();
			b = sc.nextDouble();
			System.out.println("Multiplication : "+m.multiply(a,b));
			break;
			
			case '/' :
			a = sc.nextDouble();
			b = sc.nextDouble();
			System.out.println("Division : "+d.divide(a,b));
			break;
			
			case '^' :
			a = sc.nextDouble();
			b = sc.nextDouble();
			System.out.println("Cube : "+cb.cube(a));
			break;
			
		}
	}
}