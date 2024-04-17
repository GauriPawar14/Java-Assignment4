package assignment4;

public class Duplicatechar {
	
	public static String removeDuplicate(String input)
	{StringBuffer sb= new StringBuffer();
	boolean character[]=new boolean[122];
	for(int i=0;i<input.length();i++)
	{

	char test=input.charAt(i);
	if(!character[test])
	{
	sb.append(test);
	character[test]=true;
	}
	}
	return sb.toString();

	}
	public static void main(String[] args) {
	/*boolean character[]=new boolean[122];
	StringBuffer sb= new StringBuffer();
	sb.append('/');
	sb.append('h');
	sb.append('g');
	System.out.println(sb.toString());*/
	String input="Hello World";
	String newString=removeDuplicate(input);
	System.out.println(" String after removing dublicate "+newString);


}
}
