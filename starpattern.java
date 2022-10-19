class starpattern
{
	public static void main(String args[])
	{
		int i=1;
		//System.out.print("Enter value of n: ");
		int n = Integer.parseInt(args[0]);
		while (i<=n)
		{
			int j=1;
			while (j<=i)
			{
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println();
		i=1;
		while (i<=n)
		{
			int space=1;
			while (space <= n-1)
			{
				System.out.print(" ");
				space++;
			}
			int j=1;
			while (j <= i)
			{
				System.out.print("* ");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}