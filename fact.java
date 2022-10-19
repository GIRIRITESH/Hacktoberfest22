import java.util.*;
class fact
{
	static int fact(int n)
	{
		int res = 1;
		for(int i=2; i<=n; i++)
		res = res*i;
		return res;
	}
	public static void main(String args[])
	{
		int n;
		System.out.println("Enter the value of n: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Factorial of the number is: " +fact(n));
	}
}