package assignment4;
import java.util.Scanner;
public class SquareNo {

	public static void main(String[] args) {
		System.out.println("Enter the No");
		Scanner sc = new Scanner(System.in);
		try {
		String num=sc.next();
		int num1=Integer.parseInt(num);
		
		int square=num1*num1;
		System.out.println("Square of the No = "+square);
		}catch(Exception e)
		{
			System.out.println("Enter valid Input");
			System.out.println(e.getMessage());
			
			
		}finally {
			sc.close();
		}

	}

}
