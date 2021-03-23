package coreJava;

import java.util.ArrayList;

public class arrayListexample {
	//can accept duplicate value
	//ArrayList, LinkedList,vector - Implementing List Interface
	// array can have fixed size while arraylist can grow dynamically
	// you can access and insert any value in any index

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a= new ArrayList<String>();
		a.add("Java");
		a.add("JavaScript");
		a.add("C#");
		a.add("PHP");
		System.out.println(a);
		a.add(0, "CSS");
		System.out.println(a);
		a.remove(1);// use index to remove element
		a.remove("C#");// removes element with string C#
		System.out.println(a);
		System.out.println(a.get(2));
		//testing
		System.out.println(a.contains("Selenium"));//testing true or false
		System.out.println(a.indexOf("PHP"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		

	}

}
