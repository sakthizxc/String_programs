package string_programs;
//Sort elements in dictionary order
public class Program23 {
	public static void main(String[] args) {
		String name[] = { "Kalpana", "Marimuthu","Shakthi","Shobana","Kiruba","Dheena"};
			
		System.out.println("Before sorting :");
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+ " ");
			

		}
		for(int i=0; i<name.length; i++) {
			for(int j=i+1; j<name.length; j++) {
				if(name[i].compareToIgnoreCase(name[j])>0) {
					String temp = name[i];	
					name[i]=name[j];
					name[j]=temp;
				}
			}
		}
		System.out.println("\nAfter performing lexicographical order: ");
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+ " ");
		}
	}

}
