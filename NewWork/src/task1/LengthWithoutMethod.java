package task1;

public class LengthWithoutMethod {

	public static void main(String[] args)
	{
		String main="javaDeveloper";
		 
    int count=0;
    
    for (char a : main.toCharArray())
    {
		count++;
	}
       System.out.println("length="+count);
       
	}
	}