package string_programs;
//Palindrom
public class Program11 {
	public static void main(String[] args) {
		String text = "naan";
		String st = "";
		for(int i=text.length()-1; i>=0; i--) {
			char ch=text.charAt(i); 
			st = st+ch;
				
			}
		if(st.equals(text)) {
			System.out.println("The given string is Palindrome");
		}
		else {
			System.out.println("The given string is not palindrome");
		}
	}

}
