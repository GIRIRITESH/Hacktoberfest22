class A
{
	int num;
	void show()
	{
		System.out.println("Hello from show from A num= "+num);
	}
}
class B extends A
{
	int num=50;
	void show()
	{
		super.num=120;
		super.show();
		System.out.println("Hello from show from B= "+num);
	}
}
class Labq4
{
	public static void main(String args[])
	{
		B obj = new B();
		obj.show();
	}
}