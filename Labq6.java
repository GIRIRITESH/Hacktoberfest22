class First
{
	int num;
	First(int x)
	{
		num=x;
		System.out.println("Constructor of First called");
		System.out.println("num= "+num);
	}
}
class Second extends First
{
	String str;
	Second(int d,String s)
	{
		super(d);
		str=s;
		System.out.println("Contructor of Second called");
		System.out.println("str= "+str);
	}
}
class Third extends Second
{
	private char cnum;
	Third(int d,String s,char c)
	{
		super(d,s);
		cnum=c;
		System.out.println("Constructor of Third called");
		System.out.println("cnum= "+cnum);
	}
}
class Labq6
{
	public static void main(String args[])
	{
		new Third(1947,"INDIA",'A');
	}
}