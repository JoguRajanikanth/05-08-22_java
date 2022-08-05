package intro;

public class strings {

	public static void main(String[] args) {
		String s1= new String("heloo");// allocating memory directly
		String s2= new String("ahhha");
		String s= "rajaniaknth jogu asm";
		System.out.println(s);
		String[] splitedstring=s.split(" ");//space is a delimiter & splitedstring is an array, which stores splited string in an array
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(splitedstring[0]);
		System.out.println(splitedstring[1]);
		System.out.println(splitedstring[1].trim()+"  printing the trimed word");
		System.out.println(splitedstring[2]);
		
		String[] splitedstring1=s.split("a");//"a" is a delimiter here
		System.out.println(splitedstring1[0]);
		System.out.println(splitedstring1[1]);
		System.out.println(splitedstring1[2]);
		System.out.println(splitedstring1[3]);
		System.out.println(splitedstring1[4]);
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
			
		}// reversing a sting with char
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
			
		}
		
		}		

	}

