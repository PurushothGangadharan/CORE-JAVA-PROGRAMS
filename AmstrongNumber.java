package JAVAPROGRAMS;

public class AmstrongNumber {

	public static void main(String[] args) {
     int num=153,number,temp,total=0;
     number=num;
     while(number !=0) {
    	 temp=number%10;
    	 total=total+temp*temp*temp;
    	 number/=10;
     }
     if(total==num) {
    	 System.out.println(num+"amstrong number");
     }
    	 else {
        	 System.out.println(num+"not a amstrong number");

    	 }
	       
}
}