package day13;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//p2--a&&d
public class P3 {

	public static void main(String[] args) {
		Set set = new TreeSet();
		set.add("2"); 
		set.add(3);
		set.add("1"); 
		Iterator it = set.iterator(); 
		while (it.hasNext()) {
        System.out.println(it.next()+"");
		}
	}
	
}
