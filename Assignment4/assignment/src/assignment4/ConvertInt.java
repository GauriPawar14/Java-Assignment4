package assignment4;
import java.util.*;
public class ConvertInt {
	
	public static void convertInt(String input) throws  IllegalArgumentException{
		int num=Integer.parseInt(input);
		if(num< Integer.MIN_VALUE || num>Integer.MAX_VALUE)
		{
			throw new IllegalArgumentException();
		}
	}


	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		try {
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		String num=sc.next();
		
		convertInt(num);
		System.out.println("The string converted to integer successfully");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Number should not be exceeds the range of integer");
		}
		
	}

}
