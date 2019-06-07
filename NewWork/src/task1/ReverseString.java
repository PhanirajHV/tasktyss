package task1;

public class ReverseString {

	public static void main(String[] args) {
		String main="javaDeveloper";
		  
	        String reverse = "";
	        
	        
	        for(int i = main.length() - 1; i >= 0; i--)
	        {
	            reverse = reverse + main.charAt(i);
	        }
	        
	        System.out.println("Reversed string is:");
	        System.out.println(reverse);
	    }
	}

