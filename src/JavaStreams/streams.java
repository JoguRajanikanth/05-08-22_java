package JavaStreams;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

import com.google.common.collect.Streams;

public class streams {

	public static void main(String[] args) {

		
				
		
		ArrayList<String> names= new ArrayList<String>();
		
		names.add("Axar");
		names.add("Akash");
		names.add("Rahul");
		names.add("Deepak");
		names.add("Umar");
		names.add("Anand");
		
		Long c= names.stream().filter(s->s.startsWith("D")).count();
		
	System.out.println(c);
		Stream.of("Axar","Akhay","Anudeep","Deepak","Umar").filter(s->s.endsWith("r")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
	
	}
	
	
	}


