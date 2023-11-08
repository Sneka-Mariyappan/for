package day5;

public class Count {

	public static void main(String[] args) {
		int total=0;
		int count=0;
		for(int i=100;i<=500;i++) {
			total = total+i;
			count++;
		}
		
		System.out.println(total/count);
		
		}
		

	}

