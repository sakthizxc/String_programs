package string_programs;
//Change only the first letter of a given string to upper case
public class Program18 {
	public static void main(String[]args) {
		String text = "kalpanashekar";
		char[] ch=text.toCharArray();
		ch[0]=(char)(ch[0]-32);
		System.out.print(ch[0]);
		for(int i=1; i<ch.length; i++) {
			System.out.print(ch[i]);
		}
		
	}

}
/* or
 
 String st=	text.substring(0,1).toUpperCase()+text.substring(1);
	

 System.out.println(st);
*/