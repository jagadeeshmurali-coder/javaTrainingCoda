package day13;

import java.util.TreeSet;

public class P11 {

	public static void main(String[] args) {
		TreeSet<String> s = new TreeSet<String>(); 
		TreeSet<String> subs = new TreeSet<String>(); 
		s.add("a");
		s.add("b"); 
		s.add("c"); 
		s.add("d");
		s.add("e"); 
		System.out.println(s);
		subs = (TreeSet)s.subSet("b", true, "d", true); 
		System.out.println(subs);
		s.add("g"); 
		s.pollFirst(); 
		s.pollFirst(); 
		s.add("c2"); 
		System.out.println(s);
		System.out.println(s.size() +" "+ subs.size());
	}
	
}
