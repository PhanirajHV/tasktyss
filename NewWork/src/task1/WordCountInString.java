package task1;

public class WordCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mystr="java is my favourite language";
		String []strarr=mystr.split(" ");
		int wordCount=strarr.length;
		System.out.println(wordCount+" words are there in a string");
	}

}
