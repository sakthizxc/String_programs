package string_programs;
//Find last non repeated character in a given string
public class Program24 {
	static final int N = 256;
	static String lastNonRepeatingChar(String str, int len) {
		int freq[]= new int[N];
		for(int i=0; i<len; i++) 
			freq[str.charAt(i)]++;
			for(int i=len-1; i>=0; i--) {
				char ch=str.charAt(i);
				if(freq[ch]==1) 
					return("" + ch);
					
			}
			return "-1";
		}
		
		
	
	public static void main(String[] args) {
		String str = "GeeksforGeeks";
		int len=str.length();
		System.out.println(lastNonRepeatingChar(str,len));
	}

}
