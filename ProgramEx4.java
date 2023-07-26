package string_programs;
//Check if the given string is present only alphabets
public class ProgramEx4 {
	
	public static void main(String[] args) {
		String text = "Kalpanashekar";
		int textCount=0;
		for(int i=0; i<text.length(); i++) {
			char ch=text.charAt(i);
			if(ch>='a') {
				if(ch<='z') 
					textCount++;


			}
			else if(ch>='A') {
				if(ch<='Z')
					textCount++;

		}
			
		}
		
		if(textCount==text.length()) {
			System.out.println("The given string is only present alphabets");
		}
		else {
			System.out.println("The given string is not only present alphabets ");
	
		}

}
	}

