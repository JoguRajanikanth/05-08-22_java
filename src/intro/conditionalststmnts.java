package intro;

public class conditionalststmnts {

	public static void main(String[] args) {
		int [] a1= {22,2,5,51,85,46,15,14,1,11};
		//String s[]= {"hello","astra","mwp","hyd"};

		//for(int i=0;i<s.length;i++) {
		for(int i=0;i<a1.length;i++) {
			System.out.println(a1[i]+"  list ");
			//System.out.println(s[i]+"    list ");
		}
		for(int i=0;i<a1.length;i++) {
			if(a1[i] % 2==0) {
			System.out.println(a1[i]+"  even num");
			}
			else {
				System.out.println(a1[i]+"  odd num");
			}
		
		}

	}

}
