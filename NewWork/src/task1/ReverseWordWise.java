package task1;

public class ReverseWordWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mystr="java is very good";
		String reverse="";
		String [] strarr=mystr.split(" ");
		for(int i=0;i<strarr.length-1;i++)
		{
			 for(int j = strarr.length-1; j >0; j--)
		        {
		            reverse = reverse + strarr[i].charAt(j);
		        }
		}
	}

}
