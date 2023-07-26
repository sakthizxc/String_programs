package string_programs;

//check if the given string is present only a numbers
public class ProgramEx3 {
	public static void main(String[] args) {
		String text = "kalpana18121993";
		int noCount=0;
		for(int i=0; i<text.length(); i++) {
			char ch=text.charAt(i);
			
			if(ch>='0') 
				if(ch<='9')
					noCount++;
			System.out.print(noCount);
		
	}
if(noCount==text.length()) 
	System.out.println("The given string is only present a numbers");

	else 
		System.out.println("The given string is not only present a numbers some other characters are present");
		
	}
		
}

