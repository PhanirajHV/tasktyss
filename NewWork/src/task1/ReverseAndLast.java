package task1;

public class ReverseAndLast 
{
	public static void main(String[] args) {
		String mystr="java will have bright future";
		String newstr="";
	String [] arrStr=mystr.split(" ");
	int length=arrStr.length-1;

	
	String first=arrStr[0];
	String lasthalf=arrStr[length];
	
	for(int i=first.length()-1;i>=0;i--)
		{
				 newstr = newstr + first.charAt(i);
		}

	for(int i=lasthalf.length()-1;i>=0;i--)
	{
			 newstr = newstr + lasthalf.charAt(i);
	}
	
	System.out.println("  "+newstr);	

	}	

}
