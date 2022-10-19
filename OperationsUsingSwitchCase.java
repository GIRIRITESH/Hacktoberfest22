class OperationsUsingSwitchCase
{
	public static void main(String args[])
	{
		System.out.println("Choose :\n 1 for addition\n 2 for substraction\n 3 for multiplication\n 4 for division\n");
		int choice = Integer.parseInt(args[0]);
		int x = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		
		switch(choice)
		{
			case 1:
			System.out.println("The addition of two numbers is : " +(x+y)); //addition
			break;
			case 2:
			System.out.println("The substraction of two numbers is : " +(x-y)); //subtraction
			break;
			case 3:
			System.out.println("The multiplication of two numbers is : " +(x*y)); //multiplication
			break;
			case 4:
			System.out.println("The division of two numbers is : " +(x/y)); //division
			break;
			default:
			System.out.println("Wrong Choice");
		}
	}
}
