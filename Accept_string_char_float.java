import java.io.*;
class Accept_string_char_float
{
	public static void main(String args[]) throws IOException
	{
		String a;
		int b;
		float c;
		try{
			DataInputStream p = new DataInputStream(System.in);
			System.out.println("Enter the string : ");
			a = p.readLine();
			System.out.println("The entered string is : "+a);
			System.out.println("Enter an Integer value : ");
			b = Integer.parseInt(p.readLine());
			System.out.println("The entered integer is : "+b);
			System.out.println("Enter an Float value : ");
			c = Float.parseFloat(p.readLine());
			System.out.println("The entered float value is : "+c);
		}
		catch (Exception e) {
			System.out.println("Error!!");
		}
	}
}