package string_programs;
//Printing only the numbers present in a given string

public class Program6 {
	public static void main(String[] args) {
		String text = "kalpanashekar1812";
		/*for(int i=0; i<text.length(); i++) {
			char ch=text.charAt(i);
			if(ch>='0')
			if(ch<='9'){
				System.out.print(ch);
				
			}
		}*/
		
		System.out.println(text.replaceAll("[a-zA-Z]", ""));
	}

}



