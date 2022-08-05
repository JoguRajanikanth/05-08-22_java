package JavaStreams;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.Streams;

public class Streamsmethods {

	@Test
	public void Regular() {

		ArrayList<String> names = new ArrayList<String>();

		names.add("Axar");
		names.add("Akash");
		names.add("Rahul");
		names.add("Deepak");
		names.add("Umar");
		names.add("Anand");

		Long c = names.stream().filter(s -> s.startsWith("A")).count();

		System.out.println(c);

	}
	
	@Test
	public void StreamMap() {
		
		Stream.of("Axar","Akhay","Anudeep","Deepak","Umar").filter(s->s.endsWith("r")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
		//converting Arrays to List Then Stream method applying to list
		List<String> names=Arrays.asList("Axar","       ","Akhay","Anudeep","Deepak","Umar","Akbar","Bachanpandey");
		names.stream().filter(s->s.length()>5).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));

		}
	
	@Test
	public void StreamMerging() {
		
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Axar");
		names1.add("Akash");
		names1.add("Rahul");
		names1.add("Deepak");
		names1.add("Umar");
		names1.add("Anand");
		
		List<String> names2 = Arrays.asList("agam","nilesh","kamesh","chikesh","adam");
		
		Stream<String> newStreamList = Stream.concat(names1.stream(), names2.stream());
		newStreamList.sorted().forEach(s->System.out.println(s));
		
	}
	
	@Test
	public void IntStream() {
		
		List<Integer> values = Arrays.asList(7,9,2,8,4,6,2,43,7,5);
		
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(values.get(5));
		System.out.println(li);
		System.out.println(values.size());
		System.out.println(li.size());
			
	}
	
	@Test
	public void StreamCollect() {
		
		List<String> names3 = Arrays.asList("Snshu","Jallreddy","Mangalam","Fire","Flower","Pushpa");
		boolean name = names3.stream().sorted().anyMatch(s->s.equalsIgnoreCase("Pushpa"));
		List<String> Star = names3.stream().sorted().map(s->s.toString()).collect(Collectors.toList());
		Star.stream().forEach(s->System.out.println(s));
		System.out.println(name);
	
		System.out.println(Star);
		System.out.println(names3.get(5));
		AssertJUnit.assertTrue(name);
		
		
	}
	
	

}
