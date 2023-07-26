package string_programs;
//Find first non repeated character of a given string
public class Program21 {
	public static void main (String[] args) { 
		String text = "ABCDA";
		for(int i=0; i<text.length(); i++) {
			char ch = text.charAt(i);
			boolean repeat = false;
			for(int j=0; j<text.length(); j++) {
			if(i!=j&&ch==text.charAt(j)) {
				
				repeat=true;
				break;
			}
		}
		
			if(repeat==false) {
				System.out.println(ch + " non repeated");
				break;
			}
	}

}
}
