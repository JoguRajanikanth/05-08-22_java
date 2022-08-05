package intro;

public class methodDemo {
	
//practice session1
	
	public static void main(String[] args) {
		methodDemo m1= new methodDemo();
		m1.userData();
		String name=m1.userData();
		System.out.println(name);
		userData1();
		getdata2();

	}
	public static void getdata2() {
		
		System.out.println(" getdata2 name ");
	}
	public String userData() {
		
		System.out.println("methods recalling by object into main execution part");
		return "returning the method string";
	}
	public static String userData1()
	{
		System.out.println("with out using object calling methos by using declaring as static");
		return"8";
	}
}
