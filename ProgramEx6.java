package string_programs;
//Change only alternative letters of the given string to Upper case
public class ProgramEx6 {
	public static void main(String[] args) {
		String text = "payilagam";
		char[] ch=text.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(i%2==0) 
				if(ch[i]>='a')
					if(ch[i]<='z')
				ch[i]=(char)(ch[i]-32);
		}
			text=new String(ch);
			System.out.print(text);
		}
		
	}
/*or

for(int i=0; i<text.length(); i++) {
	if(i%2==0)
		System.out.print(text.substring(i, i+1).toUpperCase());
		
	else
		System.out.print(text.substring(i,i+1).toLowerCase());
}
}*/
