package JAVAPROGRAMS;

public class Pri {

	public static void main(String[] args) {
		int input=100;
		int count=0;
		for (int i = 1; i <= input; i++) {
			if(input%i==0) {
				count++;
			}
			
		}
		if(count==2) {
			System.out.println("prime");
		}
		else {
			System.out.println("not a prime");
		}

	}

}
