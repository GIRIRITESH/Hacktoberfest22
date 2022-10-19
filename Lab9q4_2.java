import java.util.*;
public class Lab9q4_200{
	public static void main(String args[]){
		String str="HELLO";
		char[] ch= new char[str.length()];
		for(int i=0; i<str.length(); i++){
			ch[i] = str.charAt(i);
		}
		for(int i=0; i<str.length(); i++)
		{
			System.out.println(ch[i]);
		}
	    System.out.println(ch);
	}
}