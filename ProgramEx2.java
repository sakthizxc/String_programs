package string_programs;

//Printing only alphabets in a given string;
public class ProgramEx2 {
public static void main(String[] args) {
	String text = "Kalpanashekar1812";
	/*for(int i=0; i<text.length(); i++) {
		char ch=text.charAt(i);
		if(ch>='a') {
			if(ch<='z') 
				System.out.print(ch);
			}
			else if(ch>='A') {
					if(ch<='Z') 
						System.out.print(ch);
					}
			}*/
	System.out.println(text.replaceAll("[0-9]", ""));
	}
	
}

