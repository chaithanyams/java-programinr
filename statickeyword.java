package ms.java;
class first{
	//static variable
	static int a=10;
	//static block
	static {
		System.out.println("static block");
	}
	//static method
	static void cc() {
		System.out.println("static method");
	}
	
	
	
}

public class statickeyword {
	static int b=15;
	
	
	public static void main(String args[]) {
		first.cc();
		System.out.println(b);
		System.out.println(first.a);
		
	}

}
