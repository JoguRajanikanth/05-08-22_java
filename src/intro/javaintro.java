package intro;

public class javaintro {

	public static void main(String[] args) {
		int num=25;
		char letter='R';
		double d=2.22;
		float f=0.1f;
		boolean b=false;
		String name="rajanikanth jogu";
		
		System.out.println(name+"- "+num+" "+d+" "+f+" "+letter+" "+b);
				
		//array
		int[] arra= {21,29,98,46,66,03};// size of array can't be change
		//int[] arra1= new int[3];//size of array is fixed
		//arra1[0]=13;
		//arra1[1]=43;
		//arra1[2]=99;
		for(int i=0; i<arra.length; i++)
		{
			System.out.println(arra[i]);
			//System.out.println(arra1[i]);
			 
		}
		
		//strings
		String [] names= {"rajani","jogu","majama","dinchak","pooo","harika"};
		
		for(int i=0; i<names.length; i++)
		{
			System.out.println(names[i]); 
			
		}
		System.out.println("length of the String array   " +names.length);
		for(String s:names)//enhanced for loop its simplified syntax .
		{
			System.out.println(s);
		}
	}
}
