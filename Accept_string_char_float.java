import java.io.*;
class Accept_string_char_float
{
	public static void main(String args[]) throws IOException
	{
		String x;
		int y;
		float z;
		try{
			DataInputStream p = new DataInputStream(System.in);
			System.out.println("Enter the string : ");
			//entering a string
			x = p.readLine();
			System.out.println("The entered string is : "+x);
			System.out.println("Enter an Integer value : ");
			//entering an integer value
			y = Integer.parseInt(p.readLine());
			System.out.println("The entered integer is : "+y);
			System.out.println("Enter an Float value : ");
			//entering a float value
			z = Float.parseFloat(p.readLine());
			System.out.println("The entered float value is : "+z);
		}
		catch (Exception e) {
			System.out.println("Error!!");
		}
	}
}
