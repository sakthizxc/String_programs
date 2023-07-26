package string_programs;
//change upper case to lowercase in a given string
import java.io.*;
public class Program19 {
	public static void main(String[] args) {
		String text = "KalpanaShekar";
		StringBuffer str = new StringBuffer(text);
		for(int i=0; i<str.length(); i++) {
			char c=str.charAt(i);
			if(Character.isLowerCase(c)) {
				str.replace(i, i+1, Character.toUpperCase(c) + "");
			}
				
				else{
					str.replace(i, i+1, Character.toLowerCase(c) +"");
			}
			
		}
		System.out.println(str);
	}

}
