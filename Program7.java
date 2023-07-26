package string_programs;
//Count of each character in a given string

public class Program7 {
	public static void main(String[] args) {
		String text = "KalpanaShekar1812";
		int count=0;
		for(int i=0; i<text.length(); i++) {
			char ch=text.charAt(i);
			if(ch>='a')
				if(ch<='z')
					count++;
			if(ch>='A')
				if(ch<='Z')
					count++;
			if(ch>='0')
				if(ch<='9')
					count++;
		}
		System.out.println("The count of each character in a given string is: " + count);
		
	}

}
