package InterviewPrograms;

import java.util.HashSet;

public class PrintUniqueValues {
	
	public static void Numbers() {
		
		int a []= {1,3,1,4,5,2,5};
		
		HashSet<Integer> Set1= new HashSet<>();
		
		for (Integer integer : a) {
			Set1.add(integer);
		}
		System.out.println(Set1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers();
	}

}
