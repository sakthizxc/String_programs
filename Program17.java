package string_programs;

public class Program17 {
	public static void main(String[] args) {
		String text = "Notebook";
		int count = 0;
		for(int i=0; i<text.length(); i++) {
			if(text.charAt(i)!=' ') {
     count++;	
     }
			
	}
		System.out.println("The count of word in a given string is: " +count);
	}
}


