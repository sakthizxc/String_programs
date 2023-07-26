package string_programs;
//vowels is present or not in a given string
public class ProgramEx1 {
	public static void main(String[] args) {
		String text = "Kalpana";
		int count = 0;
		for(int i=0; i<text.length(); i++) {
			char ch=text.charAt(i);
			
			switch(ch) {
			case 'a': 
			case 'e':
			case 'i':
			case 'o':
			case 'u': count ++; break;
		
			}

			
		}
		if(count==0) {
			System.out.println("Vowels is not present in a given string");
		}
		else {
			System.out.println("Vowels is present in a given string");
		}
		
	}

}
