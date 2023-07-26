package string_programs;
//count of numbers in a given string
public class ProgramEx5 {
	public static void main(String[] args) {
		String text = "Chennai 600042";
		int count =0;
		for(int i=0; i<text.length(); i++) {
			char ch=text.charAt(i);
			if(ch>='0')
				if(ch<='9')
					count++;
				
		}
		System.out.println(count);
	}

}
