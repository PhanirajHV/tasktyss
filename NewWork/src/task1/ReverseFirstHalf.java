package task1;




public class ReverseFirstHalf 
{
	public static void main(String[] args) {
		String mystr="java will have bright future";
		String newstr="";
		
		int count=mystr.length();
		String firstHalf=mystr.substring(0, count/2);
		for(int i = firstHalf.length() - 1; i >= 0; i--)
        {
			newstr = newstr + firstHalf.charAt(i);
        }
	
		System.out.println(newstr);
	}	

}
