package test;
import java.util.HashSet;
import java.util.Iterator;

public class Test7 {
	public static void main(String args[]) {
		HashSet<String> hs =  new HashSet<String>();
		hs.add("Welcome");
		hs.add("Hello");
		hs.add("Bye Bye");
		hs.add("Farewell");
		System.out.println(hs.add("Hello"));
		System.out.println(hs.size());
		for(String s : hs)
			System.out.println(s);
			System.out.println(" ");
		System.out.println(hs.remove("Hello"));
		System.out.println(hs.contains("Welcome"));
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("Apple");
		hs2.add("Banana");
		hs.addAll(hs2);
		Iterator<String> itr =  hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
			System.out.println(" ");
		hs2.add("Bye Bye");
		hs.removeAll(hs2);
		for(String s : hs)
			System.out.println(s);
			System.out.println(" ");
		hs2.add("Farewell");
		hs.retainAll(hs2);
		for(String s : hs)
			System.out.println(s);
			System.out.println(" ");
				
	}

}
