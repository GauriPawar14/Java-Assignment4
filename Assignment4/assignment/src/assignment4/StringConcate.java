package assignment4;

public class StringConcate {

	public static void main(String[] args) {
		 String[] words = {"Hello", "world", "this", "is", "a", "sample", "array"};

		 StringBuilder result = new StringBuilder();

		 for (String word : words) {

	            result.append(word).append(" "); 

	        }

	        if (result.length() > 0) {

	            result.deleteCharAt(result.length() - 1);
	            }

	        System.out.println("Concatenated string: " + result.toString());

	    }

	}


