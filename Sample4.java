package day5;

public class Sample4 {
	public static void main(String[] args) {
		String name ="sneha";
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
		
				System.out.println(name.charAt(i) + " is vowels");
			}
			else {
				System.out.println(name.charAt(i) + " is consonant");
			}
			
		}
	}

}
