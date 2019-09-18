package bootCampAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayListUsingLoops {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		System.out.println(list.size());
		
		System.out.println("While Loop:");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Advanced For Loop:");
		for(Object obj : list) {
			System.out.println(obj);
	}
		System.out.println("For Loop:");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
