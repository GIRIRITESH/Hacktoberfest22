class Lab8q1{
	public static void main(String args[]){
		try{
			System.out.println("Open files");
			int n=args.length;
			System.out.println("n= "+n);
			int a=45/n;
			System.out.println("a= "+a);
		}
		catch(ArithmeticException ae){
			System.out.println("U r in catch block");
			System.out.println(ae);
			System.out.println("plz enter data in command line");
		}
		finally{
			System.out.println("Close files");
		}
	}
}