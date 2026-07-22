package java1;

public class Method {
     //Overloading

	static void add(int a,int b) {//user defind
		System.out.println(a+b);
		}
	static void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
	}
		
}
////  void show() {
///System.out.println("Non Static Method");
//}

//public static void main(String[] args) {

//Demo obj = new Demo();

//obj.show();
//}
//}