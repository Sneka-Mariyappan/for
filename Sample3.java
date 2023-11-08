package day5;

public class Sample3 { 
	public static void main(String[] args) {
		String name ="sneha";
		for(int i=0;i<name.length();i++) {
			System.out.println(name.charAt(i));
		}
		
		
		/*for(int i=0;i<=name.length();i++) {
			System.out.println(name.charAt(i)); //Stringindexoutofboundexception
	}*/
		
		for(int i=name.length()-1;i>=0;i--){
			System.out.println(name.charAt(i));
		}
	}

}
