package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingusingCollection {

	public static void main(String[] args) {
		
		String[] input= {"HCL","WIPRO","ASPIRE SYSTEMS","CTS"};
		
		List<String> values =new ArrayList<String>();
		for(String temp:input) {
		
				System.out.println(temp);
				values.add(temp);
				
		}
		System.out.println("sorted===");
		Collections.sort(values);

		for(int i=0;i<values.size();i++) {
			System.out.println(values.get(i));
		}

	}
	

}
