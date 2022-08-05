package intro;


public class methods {

	public static void main(String[] args) {
		methods m= new methods();//creating object to get the method //initializing the object
		m.getdata();// method recalling using object "m"

	}
	public void getdata() //  method ,method type is void(nothing returning)
	// if we mention method type as string, it will return a string.same for int also.
	//static is makes as the method shall access class level(without object recalling we can access the methods)
	{
		System.out.println("hello Java");
	
		// if we are returning string or int then we have to make declaration should be as string or int type
	}

}

