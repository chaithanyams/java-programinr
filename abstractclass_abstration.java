package ms.java;
abstract class dhoni{
	int h=44;
	public void keeping() {
		int i=10;
		System.out.println("bat");
	}
	public abstract void ball();
	
}
class chaithanya extends dhoni{
	

	@Override
	public void ball() {
		// TODO Auto-generated method stub
		int j=11;
		System.out.println("balling");
		System.out.println(j);
		
	}}
public class abstractclass_abstration{
	public static void main(String args[]) {
		chaithanya cc=new chaithanya();
		cc.keeping();
		cc.ball();
		System.out.println(cc.h);
	}
}
	


	
		
		
		
	
	

	 
	 
	


public class abstractclass_abstration {
	public static void main(String args[]) {
	chaithanya d=new chaithanya();
	d.keeping();
	d.ball();

}}
