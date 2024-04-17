package assignment4;

public class WrapperClass {

	public static void main(String[] args) {
		Integer num1 = new Integer(20);

        Integer num2 = new Integer(10);

        System.out.println("Comparing Integer objects:");

        System.out.println("num1 == num2: " + (num1 == num2)); 

        System.out.println("num1.equals(num2): " + num1.equals(num2)); 

        System.out.println();


        Float float1 = new Float(5.5);

        Float float2 = new Float(5.5);

        System.out.println("Comparing Float objects:");

        System.out.println("float1 == float2: " + (float1 == float2)); 

        System.out.println("float1.equals(float2): " + float1.equals(float2)); 

        System.out.println();
        

        Integer a = 1000;

        Integer b = 1000;
        

        System.out.println("Demonstrating when to use equals() instead of ==:");

        System.out.println("a == b: " + (a == b)); 

        System.out.println("a.equals(b): " + a.equals(b)); 

	}

}
