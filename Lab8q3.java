class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
}
public class Lab8q3{
	public static void main(String args[]){
		int marks[] = {50,70,101};
		try{
			int sum = 0;
			for(int i = 0; i<marks.length; i++){
				if(marks[i]>100)
					throw new MyException("Marks Greater than 100");
				sum=sum+marks[i];
			}
			System.out.println("Average: " +sum/3.0);
		}
		catch(MyException e){
			System.out.println("Exception Caught");
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("End of the program");
		}
	}
}