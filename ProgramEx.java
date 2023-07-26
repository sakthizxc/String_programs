package string_programs;
//count of fist character in a given string
public class ProgramEx {
	public static void main(String[] args) {
		String word = "marimuthu";
		char first=word.charAt(0);
		int count =1;
		//System.out.println(first);
		for(int i=1; i<word.length(); i++) {
			if(first==word.charAt(i)) 
				count++;
			
			
		}
		System.out.println("Count of first char is: " +count);
	}

}
