package day5;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 5;
		boolean isprime=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isprime=false;
			}
		}
		if(isprime==true) {
			System.out.println(num + " is prime");
		}
		else {
			System.out.println(num + "is not prime");
		}

	}

}
