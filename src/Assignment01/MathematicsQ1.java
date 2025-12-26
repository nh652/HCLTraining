package Assignment01;
import java.util.Scanner;
class MathematicsQ1{
	public static int add(int a, int b) {
		return a+b;
	}
	public static int sub(int a, int b) {
		return a-b;
	}
	public static int mul(int a, int b) {
		return a*b;
	}
	public static int div(int a, int b) {
		return a/b;
		
	}
	public static int rem(int a, int b) {
		return a%b;
	}
	public static int squ(int a) {
		return a*a;
	}
	public static int cube(int a) {
		return a*a*a;
	}
	public static int abs(int a) {
		return Math.abs(a);
	}



public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your choice number");
	System.out.println("1.Addition, 2. Subtraction, 3. Multiplication, 4. Division, 5. Square, 6. Cube, 7.Remainder, 8. Absolute");
	int choice = sc.nextInt();
	int a,b;
	switch(choice) {
	case 1 :  a = sc.nextInt();
			  b = sc.nextInt();
			 System.out.println(add(a,b));
			 break;
	
	case 2 : a = sc.nextInt();
			 b = sc.nextInt();
	 System.out.println(sub(a,b));
	 break;
	
	case 3 : a = sc.nextInt();
	         b = sc.nextInt();
	         System.out.println(mul(a,b));
	 		 break;
	 		 
	case 4 : a = sc.nextInt(); 
			 b = sc.nextInt();
    System.out.println(div(a,b));
	 break;
	 
	case 5 : a = sc.nextInt();    		
    System.out.println(squ(a));
	 break;	 
	 
	case 6: a = sc.nextInt();    		
    System.out.println(cube(a));
	 break;
	 
	case 7: a = sc.nextInt();  
			b = sc.nextInt();
    System.out.println(rem(a,b));
	 break;
	 
	case 8: a = sc.nextInt();
	System.out.println(abs(a));
	break;
	
	default : 
		System.out.println("invalid entry");

	}
sc.close();
}}

