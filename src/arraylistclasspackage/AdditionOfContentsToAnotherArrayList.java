package arraylistclasspackage;

import java.util.ArrayList;

public class AdditionOfContentsToAnotherArrayList {
	
	
	public static void main(String[]args) {
		
		ArrayList<String> al2=new ArrayList<String>();
		
		al2.add("abc");
		
		al2.add("def");
		
		al2.add("ghi");
		
		al2.add("xyz");
		
		al2.remove(0); // Here 0 indicates index position number
		
		al2.set(1, "wxy"); // This code is overlapped by below code
		
		al2.set(1, "tuv");
		
		al2.add("tuv");
		
		System.out.println(al2);
		
		
		ArrayList<String> al3=new ArrayList<String>();
		
		al3.add("Delhi");
		
		al3.add("Mumbai");
		
		al3.add("Kolkata");
		
		al3.add("Pune");
		
		al3.addAll(al2);
		
		System.out.println(al3);
		
		
		
		
	
				
		
	}
		


}
