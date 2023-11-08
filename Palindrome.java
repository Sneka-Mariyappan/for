package day5;

public class Palindrome {

	public static void main(String[] args) {
		
		String name ="malayalam";
		String reverse = "";
			
		//for(int i=name.length()-1;i>=0;i--) {
			//reverse = reverse+name.charAt(i);
	//	}
		
		for(int i=0;i<name.length();i++) {
			reverse = name.charAt(i)+reverse;
		}
	
		
		System.out.println(reverse);
		if(name.equals(reverse)) {
		System.out.println("palindrome");
			
		}
		
		


	}
}


