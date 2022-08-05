package intro;

public class Stringreversewithchar {

	public static void main(String[] args) {
		String s= "java phone shades";
		String[] splitstring = s.split(" ");
		System.out.println(s);
		for (int i=0;i<splitstring.length;i++) {
			System.out.println(splitstring[i]);
			//printting " " splitstring
			}
		System.out.println(splitstring[0]);// printing splited word using indexing
		System.out.println(splitstring[1]);
		System.out.println(splitstring[2]);
			for(int i=0;i<s.length();i++)
			{
				System.out.println(s.charAt(i));
				
			}
			
					
	}

}
