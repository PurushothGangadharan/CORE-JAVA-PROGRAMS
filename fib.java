package JAVAPROGRAMS;

public class fib {
	public static void main(String[] args) {
		int a=0,b=1,c,i,n=10;
		System.out.println(a);
		System.out.println(b);
		for(i=2;i<n;i++) {
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;

			
		}

	}

}
