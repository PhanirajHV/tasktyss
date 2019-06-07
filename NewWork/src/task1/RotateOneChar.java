package task1;

public class RotateOneChar {

	public static void main(String[] args) {
		
		String myStr="javaDeveloper";
		
		char [] charstr=myStr.toCharArray();
		for(int i=0;i<=charstr.length-1;i++)
		{
		
		if(i==0)
		{
			charstr[i]=myStr.charAt(myStr.length() -1);
		}
		}
		System.out.println(charstr);
		//incomplete
	}

}
