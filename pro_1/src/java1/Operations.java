package java1;

public class Operations {
	
	public static void main(String[] args) {
		 int a = 10;
		 int b = 20;
		 
		 System.out.println(a+b);///arithmetic
		 System.out.println(a-b);
		 System.out.println(a*b);
		 System.out.println(a/b);
		 System.out.println(a%b);
		 
		 System.out.println(a++);//unary
		 System.out.println(++b);
		 
		 System.out.println(a>b);//Relational
		 System.out.println(a<b);
		 System.out.println(a==b);
		 System.out.println(a!=b);
		 System.out.println(a>b&&a<b);///logical
		 
		 System.out.println(++a); //11 Unary Operators
		 System.out.println(--a); //10
		 System.out.println(!false);
		 
		 a += 5;
		 System.out.println(a); ///Assignment Operator
		 

         System.out.println(a >= 18 && a <= 60);///Logical Operators
         
         System.out.println(a & b);
         System.out.println(a | b);///bitwise
         

         int max = (a > b) ? a : b;////Ternary Operator

         System.out.println(max);
		 
	}
}
