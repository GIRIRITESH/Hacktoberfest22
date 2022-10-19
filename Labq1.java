class Teacher
{
	 protected String a;
	 protected String b;
	 protected String c;
	 void show()
	 {
		 System.out.println("NAME: " +a+ "\nBRANCH: " +b+ "\nSUBJECT: " +c);
	 }
}
class Student extends Teacher
{
}
class Labq1
{
	public static void main(String args[])
	{
		Teacher t = new Teacher();
		t.a = "PALASH RAY";
		t.b = "CSE DEPT.";
		t.c = "OOPS";
		t.show();
		System.out.println();
		t = new Student();
		t.a = "AYANIKA MAJUMDAR";
		t.b = "CSE BATCH-1";
		t.c = "OOPS";
		t.show();
	}
}
	 