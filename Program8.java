package string_programs;
//Finding duplicate characters in a given string
public class Program8 {
	public static void main(String[] args) {
		String text = "pushpavalli";
		int count=0;
		char [] ch=text.toCharArray();
		boolean[] cc=new boolean[ch.length];
		for(int i=0; i<ch.length; i++) {
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j] && cc[i]==false) {
					System.out.println("The duplicate characters in a given string is:" + ch[j]);
					cc[j]=true;
					count++;
					
					break;
				

			}

		}
		}
		System.out.println("The duplicate characters in a given string is: " + count);

	}

}
