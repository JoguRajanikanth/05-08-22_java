package intro;

public class factorial {

	public static void main(String[] args) {
		 
		int a=1;
		String s="";
		for (int i=1;i<=5;i++) {
			a=a*i;
			s+=i+"*";
		}
		System.out.println(a);
		System.out.println(s);
		}

}
