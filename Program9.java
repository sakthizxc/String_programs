package string_programs;

//count of total number of occurrences of a given char in a string without using loop 
public class Program9 {
	public static void main(String[] args) {
		String text = "kalpanashekar";
		char c='a';
		int count = text.length()-text.replace("a","").length();
		System.out.println("Number of occurrences of a in "+ text +" = "+ count);
	}

}
