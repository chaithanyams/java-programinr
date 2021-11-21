package oops.java;
//compiletime polymorphism
/*class hero{
    void add() {
		System.out.println("0");
	}
	     void add(int a) {//to return we have to change it to static int add()
		System.out.println(a);
		//return a;
	}

}

public class polymorphism {
	public static void main(String args[]) {
		hero ob=new hero();
		
		ob.add();
		ob.add(1);
		//System.out.print(hero.add(12));
		
	}

}*/
//runtime polymorphism
class hero{
	void add(){
		System.out.println("hero1");
	}
}
class villan extends hero{
	void add() {
		System.out.println("hero2");
	}
 }
public class polymorphism {
	public static void main(String args[]) {
		villan ob=new villan();
		ob.add();
		hero k=new hero();
		k.add();
	}
}
		
		
