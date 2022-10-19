import java.util.*;
class find
{
	private int n,x;
	void getSize(int num)
	{
		n=num;
	}
	private int base[]=new int[n];
	void getArray(int arr[])
	{
		base=arr;
	}
	void getX(int check)
	{
		x=check;
	}
	int find()
	{
		for(int i=0;i<n;i++)
		{
			if(base[i]==x)
			{
				return 1;
			}
		}
		return 0;
	}
}
public class array
{
	public static void main (String args [])
	{
		Scanner sc=new Scanner(System.in);
		find f=new find();
		try
		{
			System.out.println("Enter the size of the array: ");
			int size=sc.nextInt();
			f.getSize(size);
			int arr[]=new int [size];
			System.out.println("Enter array elements: ");
			for(int i=0;i<size;i++)
				arr[i]=sc.nextInt();
			f.getArray(arr);
			System.out.println("Enter element to be searched for: ");
			int check=sc.nextInt();
			f.getX(check);
			int result=f.find();
			if (result==1)
				System.out.println("Element found");
			else
				System.out.println("Error! Try again");
		}
		catch (Exception e)
		{
			System.out.println("Error!!");
		}
	}
}