package string_programs;
//count of vowels in a given string
public class Program5 {
	public static void main(String[] args) {
		String text = "education";
		int count = 0;
		for(int i=0; i<text.length(); i++) {
		char ch= text.charAt(i);
		switch(ch) {
		case 'a': count++; break;
		case 'e': count++; break;
		case 'i': count++; break;
		case 'o': count++; break;
		case 'u': count++; break;
		
			
		}
		}
		System.out.println("count of vowels " + count);

		
	}

}
