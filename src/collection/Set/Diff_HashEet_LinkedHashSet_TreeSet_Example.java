package collection.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Diff_HashEet_LinkedHashSet_TreeSet_Example {

	
	/*
	                     
	1. Internal Implementation :
	     HashSet is backed by an HashMap instance, LinkedHashSet is 
	     implemented using HashSet and LinkedList while TreeSet is backed up by NavigableMap in 
	     Java and by default it uses TreeMap.
   
    2. Ordering : 
         HashSet does not maintain any order while LinkedHashSet maintains insertion 
         order of elements much like List interface.
         TreeSet orders the elements according to supplied Comparator. 
         If no comparator is supplied, elements will be placed in their natural ascending order.

    3. Performance and Speed : 
         HashSet is fastest, 
         LinkedHashSet is second on performance or almost similar to HashSet 
         but TreeSet is bit slower because of sorting operation it needs to perform on each insertion.
         

    4. Insertion, Removal And Retrieval Operations :
         HashSet gives performance of order O(1) for insertion, removal and retrieval operations.
	     LinkedHashSet also gives performance of order O(1) for insertion, removal and retrieval operations.                                
	     TreeSet gives performance of order O(log(n)) for insertion, removal and retrieval operations.                                
	                                     
	5.Comparison :                                       
	
	     HashSet uses equals() and hashCode() methods to compare the elements and thus removing the possible duplicate elements.                               
	     LinkedHashSet also uses equals() and hashCode() methods to compare the elements.                                
	     TreeSet uses compare() or compareTo() methods to compare the elements and thus removing the possible duplicate elements.
	     It doesn’t use equals() and hashCode() methods for comparision of elements.                                
	                                     
	6.Null elements :
	     HashSet allows maximum one null element.
	     LinkedHashSet also allows maximum one null element.                            
	     TreeSet doesn’t allow even a single null element. If you try to insert null element into TreeSet, it throws NullPointerException.                                
	                                     
	7.Memory Occupation                                     
	     HashSet requires less memory than LinkedHashSet and TreeSet as it uses only HashMap internally to store its elements.
	     LinkedHashSet requires more memory than HashSet as it also maintains LinkedList along with HashMap to store its elements.
	     TreeSet also requires more memory than HashSet as it also maintains Comparator to sort the elements along with the TreeMap.                                
	                                     
	8.Use :                                     
	     Use HashSet if you don’t want to maintain any order of elements.                                
	     Use LinkedHashSet if you want to maintain insertion order of elements.                                
	     Use TreeSet if you want to sort the elements according to some Comparator.   
	     
	                                  
	***** Similarites******
	  
	 1) Duplicates : All three implements Set interface means they are not allowed to store duplicates.

     2) Thread safety : HashSet, TreeSet and LinkedHashSet are not thread-safe, if you use them in multi-threading environment where 
        at least one Thread  modifies Set you need to externally synchronize them.

     3) Fail-Fast Iterator : Iterator returned by TreeSet, LinkedHashSet and HashSet are fail-fast Iterator. 
        i.e. If Iterator is modified after its creation by any way other than Iterators remove() method,
        it will throw ConcurrentModificationException with best of effort.
                          
	
	 */
	

	
	public static void main(String args[]){ 
		HashSet<String> NumberStore = new HashSet<String>();
        LinkedHashSet<String> NumberMarket = new LinkedHashSet<String>();
        TreeSet<String> NumberBuzz = new TreeSet<String>();
      
        for(String num: Arrays.asList("One", "Two", "Four")){
            NumberStore.add(num);
            NumberMarket.add(num);
            NumberBuzz.add(num);
        }
       
        //no ordering in HashSet – elements stored in random order
        System.out.println("Ordering in HashSet :" + NumberStore);

        //insertion order or elements – LinkedHashSet storeds elements as insertion
        System.err.println("Order of element in LinkedHashSet :" + NumberMarket);

        //should be sorted order – TreeSet stores element in sorted order 
        System.out.println("Order of objects in TreeSet :" + NumberBuzz); 
     

        //Performance test to insert 10M elements in HashSet, LinkedHashSet and TreeSet
        Set<Integer> numbers = new HashSet<Integer>();
        long startTime = System.nanoTime();
        for(int i =0; i<10000000; i++){
            numbers.add(i);
        }

        long endTime = System.nanoTime();
        System.out.println("Total time to insert 10M elements in HashSet in sec : "
                            + (endTime - startTime));
      
      
        // LinkedHashSet performance Test – inserting 10M objects
        numbers = new LinkedHashSet<Integer>();
        startTime = System.nanoTime();
        for(int i =0; i<10000000; i++){
            numbers.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Total time to insert 10M elements in LinkedHashSet in sec : "
                            + (endTime - startTime));
       
        // TreeSet performance Test – inserting 10M objects
        numbers = new TreeSet<Integer>();
        startTime = System.nanoTime();
        for(int i =0; i<10000000; i++){
            numbers.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("Total time to insert 10M elements in TreeSet in sec : "
                            + (endTime - startTime));
    }
}
