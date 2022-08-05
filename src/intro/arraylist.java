package intro;

import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args) {
		ArrayList<String> a= new ArrayList<String>();// creating object of class--->object,metode
		a.add("Hello");
		a.add("kaka");
		a.add("majama");
		a.add("arey");
		//a.remove(3);// to remove 
		a.get(1);	//extracting string
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		System.out.println(a.get(3));
		//System.out.println(a.remove(2));
		for(int i=0;i<4;i++){
			
			System.out.println(a.get(i));
			
		}
		
	}

}
