package string_programs;
//Find the char which occured the highest times in a given string 
public class Program22 {
	static final int N = 256;
	static  char getMaxOccurringCharacter(String str) {
		int count[] = new int[N];
		int len =str.length();
		for(int i=0; i<len; i++) 
			
		count[str.charAt(i)]++;
		int max=-1;
		char result= ' ';
		for(int i=0; i<len; i++) {
			if(max<count[str.charAt(i)]) {
				max=count[str.charAt(i)];
				result = str.charAt(i);
			}
		
	}
		return result;
		
		}
	

	
	public static void main(String[] args) {
		String str = "geeksforgeeks";
					
		System.out.println("Max occuring character is :" + getMaxOccurringCharacter(str));
		
			
				}
				
		
	}


