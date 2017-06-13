package collection.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	/*
	  Ordered version of HashSet.
	  Contain unique element.
	  Heavy wight.
	  
	 
	 */
	
	 public static void main(String[] args) 
	    {  
	        LinkedHashSet<String> linkedset = 
	                           new LinkedHashSet<String>();  

	      // Adding element to LinkedHashSet  
	        linkedset.add("A");  
	        linkedset.add("B");  
	        linkedset.add("C");  
	        linkedset.add("D"); 
	        linkedset.add(null); //one null is allow

	        //This will not add new element as A already exists 
	        linkedset.add("A"); 
	        linkedset.add("E");  
	        linkedset.add(null); /*if you try to insert second null it will not 
	                              throw exception bt set shows only one null value.*/

	        System.out.println("Size of LinkedHashSet = " +
	                                    linkedset.size()); 
	        
	        System.out.println("Original LinkedHashSet:" + linkedset);  
	        
	        System.out.println("Removing D from LinkedHashSet: " +
	                            linkedset.remove("D"));  
	        
	        System.out.println("Trying to Remove Z which is not "+
	                            "present: " + linkedset.remove("Z")); 
	        
	        System.out.println("Checking if A is present=" + 
	                            linkedset.contains("A"));
	        
	        System.out.println("Updated LinkedHashSet: " + linkedset);  
	    }  
}
