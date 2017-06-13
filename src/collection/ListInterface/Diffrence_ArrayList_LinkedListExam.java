package collection.ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;

public class Diffrence_ArrayList_LinkedListExam {

	
	/*
	                     ****     Difference    ****  
	   
	   ArrayList					LinkedList
	
	1. backed by array,                   1.  doubly linkedList.
	   dynamic array. 
	
	2. Insertion and removal is           2.  Insertion and removal is faster than 
	   not fast.because resizing              arrayList.No need of resizing so time complexity
	   is required,if ArrayList grow          is O(1).
	   copying of content to another 
	   list takes time
	   for these operations time
	   Complexity is O(n).                             
	
	3. Less memory is required            3.  More memory required as it holds 
	   because each index holds               actual data as well as address of 
	   actual data.                           next and previous node.
	
	4. Required O(n) to search            4.  Also required O(n) time 	                                          
	   element,However binary search          to find element.    
	   can be applied if it is sorted.
	
	5. LinkedList can be iterated in      5.  we need to write our                                 
	   reverse direction using                own code to iterate over the ArrayList
	   descendingIterator()                   in reverse direction. 
	   while there is no
	   descendingIterator() 
	
	
	Note : ArrayList is based on index so any where if you want to perform operation then go for ArrayList.
	
	
	
	                         ****  Similarities ****
	                           
	                           
	 1. Not synchronized  :  Both ArrayList and LinkedList are not synchronized , made synchronized explicitly using Collections.synchronizedList() method.

     2. clone() operation :  Both ArrayList and LinkedList returns a shallow copy of the original object ,i.e. the elements themselves are not cloned.

     3. Iterators         : The iterators returned by ArrayList and LinkedList class's iterator and listIterator methods are fail-fast. 
                            Fail fast iterators throw ConcurrentModificationException . 
	
	 4.  Insertion Order : As ArrayList and LinkedList are the implementation of List interface,so, they both inherit properties of List .
	                       They both preserves the order of the elements in the way they are added to the ArrayList or LinkedList object.
	
	*/
	
	 public static void main(String[] args)
	    {
	        ArrayList<String> arrlistobj = new ArrayList<String>();
	        arrlistobj.add("Bhushan");
	        arrlistobj.add("Arun");
	        arrlistobj.add("Amol");
	        arrlistobj.remove(1);  // Remove value at index 2
	        System.out.println("ArrayList object output :" +  arrlistobj);
	 
	        // Checking if an element is present.
	        if (arrlistobj.contains("Amol"))
	            System.out.println("Found");
	        else
	            System.out.println("Not found");
	 
	 
	        LinkedList <String>llobj = new LinkedList<>();
	        llobj.add("Bhushan");
	        llobj.add("Arun");
	        llobj.add("Amol");
	        llobj.remove("Arun");
	        System.out.println("LinkedList object output :" + llobj);
	 
	        // Checking if an element is present.
	        if (llobj.contains("Amol"))
	            System.out.println("Found");
	        else
	            System.out.println("Not found");
	    }
	
	
	
}
