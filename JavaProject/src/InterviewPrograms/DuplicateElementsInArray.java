package InterviewPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateElementsInArray {

	public static String infra []= {"Amazon","Flipkart","Azure","Amazon","Azure","Flipkart","HCL"};

	public static void BruceSet() {

		System.out.println("********* Bruce Set***********");

		for(int i=0;i<infra.length;i++) {

			for(int j=i+1;j<infra.length;j++) {

				if(infra[i]==infra[j]) {
					System.out.println(infra[j]);
				}

			}
		}

	}


	public static void hashSet() {

		System.out.println("********* HashSet***********");

		Set<String> Sets=new HashSet<String>();

		for (String e : infra) {

			if(Sets.add(e)==false){

				System.out.println(e);
			}

		}
	}


	public static void hashMap() {

		System.out.println("********* HashMap***********");

		Map<String , Integer> maps= new HashMap<>();

		for (String e : infra) {
			Integer count =maps.get(e);

			if(count==null) {
				maps.put(e, 1);
			}
			else
			{
				maps.put(e, ++count);
			}
		}

		Set<Entry<String, Integer>> entrySet=maps.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>1)
				System.out.println(entry.getKey());

		}
		System.out.println(maps);
	}


	public static void streams() {
		System.out.println("********* Streams Set and Filter***********");

		Set<String> Sets=new HashSet<String>();

		Set<String> set=Arrays.asList(infra)
				.stream().filter(e->!Sets.add(e))
				.collect(Collectors.toSet());

		System.out.println(set);
	}

	public static void stremas2() {

		System.out.println("********* StreamsGrouping By **********");

		Set<String> set=Arrays.asList(infra)
				.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toSet());

		System.out.println(set);
	}


	public static void stream3() {
		
		System.out.println("********* Streams  Frequency **********");
		
		List<String> list=Arrays.asList(infra);

		Set<String> set=list.stream().filter(e-> Collections.frequency(list, e)>1).collect(Collectors.toSet());
		
		System.out.println(set);

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BruceSet();
		hashSet();
		hashMap();
		streams();
		stremas2();
		stream3();
	}

}
