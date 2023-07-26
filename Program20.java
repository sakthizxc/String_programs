package string_programs;
import java.util.*;
//Two strings are anagram or not
public class Program20 {
	public static void main(String[] args) {
		String s1 = "Dous";
		String s2 = "Soud";
		if(s1.length()!=s2.length()) {
			System.out.println("The two string are not anagram");
		}
		else {
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			char [] String1=s1.toCharArray();
			char [] String2=s2.toCharArray();
			Arrays.sort(String1);
			Arrays.sort(String2);

			//System.out.println(Arrays.toString(String1));
			//System.out.println(Arrays.toString(String2));
		

			if(Arrays.equals(String1, String2)) {
				System.out.println("The two strings are anagram");
			}
			else {
				System.out.println("The two strings are not anagram");
			}
		}
		
	}

}
