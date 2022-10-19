class Commercial
{
	private String name;
	void setname(String name)
	{
		this.name=name;
	}
	String getname()
	{
		return name;
	}
	void CalculateBill(int unit)
	{
		System.out.println("Commercial Customer= "+getname());
		System.out.println("Bill amount= "+unit*5.00);
	}
}
class Domestic extends Commercial
{
	void CalculateBill(int unit)
	{
		System.out.println("Domestic Customer= "+getname());
		System.out.println("Bill amount= "+unit*2.50);
	}
}
class Labq5
{
	public static void main(String args[])
	{
		Commercial c = new Commercial();
		c.setname("Ayanika Majumdar");
		c.CalculateBill(60);
		Domestic d = new Domestic ();
		d.setname("Ankita Das");
		d.CalculateBill(60);
	}
}