package collection.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	
	/*
	 
	  Set
	  
	  Unorder coolction of object
	  dupicates not allow
	  can contain at most one null. 
	  
	  
	  
	  
	  
	  
	 */
	public static void main(String[] args)
    {
        HashSet<Object> hashset = new HashSet<Object>();
        
        hashset.add(3);
        
        hashset.add("Bhushan");
        hashset.add("Darandale");
        
        hashset.add(3);                          // duplicate elements
        hashset.add(null);                       //one null allow
        hashset.add("Developer");            
        
        System.out.println("Set is "+hashset);  //  o/p :  [3, Blogspot, Java Hungry]
        
        
        
        
      // addAll,retainAll,removeAll
        
        

        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, }));
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4}));
 
        // To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);
 
        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);
 
        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);
        
        
        
    }
}
