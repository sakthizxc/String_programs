package string_programs;

//Convert char Array to string
public class Program14 {
	public static void main(String[] args) {
		char ch[] = {'a','b','c','d'};
		String st=String.valueOf(ch);
		System.out.println(st);
		String ss = new String(ch);
		System.out.println(ss);

	}

}
