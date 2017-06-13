package collection.Set;

import java.util.TreeSet;

public class TreeSetExample {

	
	
	 public static void main (String[] args)
	    {
	 
	        TreeSet ts5 = new TreeSet();
	 
	        // Uncommenting below  throws NoSuchElementException
	        // System.out.println(ts5.first());
	 
	        // Uncommenting below throws NoSuchElementException
	        // System.out.println(ts5.last());
	 
	        ts5.add("Bhushan");
	        ts5.add("Darandale");
	        ts5.add("practice");
	 
	        System.out.println(ts5.first());			 // Bhushan
	        System.out.println(ts5.last()); 			//Practice
	 
	        // Elements less than O. It prints
	        // [Bhushan, Darandale]
	        
	        System.out.println(ts5.headSet("O"));
	 
	        // Elements greater than or equal to G.
	        // It prints[practice]
	        System.out.println(ts5.tailSet("G"));
	 
	        // Elements ranging from C to P
	        // It prints [Darandale]
	        System.out.println(ts5.subSet("C","P"));
	 
	        // Deletes all elements from ts5.
	        ts5.clear();
	 
	        // Prints nothing
	        System.out.println(ts5);
	        
	        
	        
	      //Null insertion in TreeSet
	   	 
	   	 
	   	 TreeSet ts2= new TreeSet();
	        ts2.add("A");
	        ts2.add("B");
	        ts2.add("C");
	        ts2.add(null); // Throws NullPointerException
	    }
	
	
	
	
}
