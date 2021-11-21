package ms.java;
interface cricket{
	void chaithanya();
	void kholi();
	
}
class roith implements cricket{

	@Override
	public void chaithanya() {
		// TODO Auto-generated method stub
		System.out.println("cricket");
		
	}

	@Override
	public void kholi() {
		// TODO Auto-generated method stub
		
	}
	
}
public class interface_abstraction {
	public static void main(String args[]) {
		roith r=new roith();
		r.chaithanya();
		//r.kholi();
		
	}

}
