package intro;

public class methodsDemo {

	public static void main(String[] args) {
		methodsDemo m=new methodsDemo();
		//m.getdata();
		String returnName=m.getdata();
		System.out.println(returnName);
		methodsdemo2 m1=new methodsdemo2();// method recalling from another class
		m1.getUserData();
		getdata2();
		
	}
	public String getdata() //  Returning String here
	//public void getdata() // void means nothing is returning here just executing the program
	{
		System.out.println("Hello Javaaa");
		System.out.println("Her hero is here");
		return "Hello Java will replaces with returned string";
	}
	public static String getdata2() //  Returning String here
	//public void getdata() // void means nothing is returning here just executing the program
	{
		System.out.println("Hello Javaaa2");
		System.out.println("Her hero is here2");
		return "Hello Java will replaces with returned string2";
	}
}
// without creating object to call methods by keping public static String getdata
// if we mention as static it will moves to class level