package assignment4;
import java.util.Scanner;

class NoVowels extends Exception{
	public NoVowels(String msg) {
		super(msg);
	}
}
public class CheckVowels {
	public static void checkVowels(String input) throws NoVowels{
		boolean containsVowels= false;
		String vowel="AEIOUaeiou";
		for(int i=0;i<input.length();i++) {
			char test=input.charAt(i);
			if(vowel.contains(String.valueOf(test))) {
				containsVowels=true;
				break;
			}
		}
		if(!containsVowels)
		{
			throw new NoVowels("This string does not contain any vowels");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		try {
		String input=sc.next();
		checkVowels(input);
		System.out.println("The String contains Vowels");
		
	}
		catch(NoVowels e) {
			System.out.println(e.getMessage());
		}
	}
	}


