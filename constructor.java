package ms.java;
class chaitu{
	//defualt constructor
	chaitu(){
		System.out.println("hero");
	}
	//parametrize constructor
	chaitu(int a){
		System.out.println(a);
		
	}
	
}

public class constructor {
	public static void main(String args[]) {
		chaitu c=new chaitu(100);
		chaitu h=new chaitu();
	}

}
