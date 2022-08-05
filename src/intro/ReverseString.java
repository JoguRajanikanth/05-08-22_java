package intro;

public class ReverseString {

	public static void main(String[] args) {
		String name= new String("Rajanikanth");
		
		System.out.println(name.length());
		
		for(int i=name.length()-1;i>=0;i--) {
			//lenght is  11;
			// Index will starts with 0th Location;
			//here we have taken i vaalue is length-1, bcoz of leght indicates 11,with index value thers is no char at 11th place,
			//  always Index value=Lenght-1;
			
			System.out.println(name.charAt(i));
			
		}

	}

}
