package string_programs;

public class Program4 {
	public static void main(String[] args) {
		String text = "NoteBook";
		char search = 'o';
		int count = 0;
		for(int i=0; i<text.length(); i++) {
			if(search==text.charAt(i))
				count++;
		}
		System.out.println("Count of "+ search + " is : " + count);
		
	}

}
