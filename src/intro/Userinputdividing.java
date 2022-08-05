package intro;

import java.util.Scanner;

public class Userinputdividing extends ArithmeticException {

	public static void main(String[] args) {
		int count = 2, temp1,temp;    	
    	//User inputs the array size
        Scanner scan = new Scanner(System.in);       
         int num[] = new int[count];        
        for (int i = 0; i < count; i++)  
        {
        	System.out.println("Enter array element:");
            num[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < count; i++) 
        {
            for (int j = i; j < count; j++) { 
            	
                if (num[i] > num[j]) 
                {
                   try{
                	   
                   temp = num[i]/num[j];
                	   
                    System.out.println("Coeficient  "+temp);
                   }
                   catch(ArithmeticException e) {
                	
                		 System.out.println("invalid users");            		
                
                	}
                }
            }
	}

}
}