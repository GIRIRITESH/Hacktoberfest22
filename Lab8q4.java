class L{
	L method(){
		return null;
	}
}
class Lab8q4{
	public static void main(String args[]){
		try{
			int[] a = new int[-3];
		}
		catch(NegativeArraySizeException e){
			System.out.println("Enter the positive size of array");
		}
		try{
			String s="1 2 *";
			int x=Integer.parseInt(s);
		}
		catch(NumberFormatException e){
			System.out.println("Enter Integers");
		}
	}
}