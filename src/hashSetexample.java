package coreJava;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetexample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashset, treeset, Linkedhashset implements set interface
		//set interface does not accept duplicate values
		//there is no guarantee elements stored in sequential order
	
	HashSet<String> hs= new HashSet<String>();
	hs.add("USA");
	hs.add("UK");
	hs.add("GERMANY");
	hs.add("he");
	hs.add("she");
	System.out.println(hs);
	//System.out.println(hs.remove("UK"));
	System.out.println(hs.isEmpty());
	System.out.println(hs.size());
	
	//Iterator
	Iterator<String>i=hs.iterator();
	while(i.hasNext()) {
	System.out.println(i.next());
	}
	}

}
