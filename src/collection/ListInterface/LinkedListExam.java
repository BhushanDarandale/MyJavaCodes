package collection.ListInterface;

import java.util.LinkedList;

public class LinkedListExam {

	
	
	  public static void main(String args[])
	    {
	        // Creating  linked list
	        LinkedList<String> object = new LinkedList<String>();
	 
	        // Adding elements to the linked list
	        object.add("Amol");
	        object.add("Faiza");
	        object.addLast("Chetan");
	        object.addFirst("Dinesh");
	        object.add(2, "Emirates");
	        object.add("Bhushan");
	        object.add("Gaurav");
	        System.out.println("Linked list : " + object);  // o/p :  [Dinesh, Amol, Emirates, Faiza, Chetan, Bhushan, Gaurav]
	 
	        // Removing elements from the linked list
	        object.remove("Faiza");
	        object.remove(3);
	        object.removeFirst();
	        object.removeLast();
	        System.out.println("Linked list after deletion: " + object); // o/p : [Amol, Emirates, Bhushan]
	 
	        // Finding elements in the linked list
	        boolean status = object.contains("Bhushan");
	 
	        if(status)
	            System.out.println("List contains the element 'Bhushan' "); //true
	        else
	            System.out.println("List doesn't contain the element 'Bhushan'");
	 
	        // Number of elements in the linked list
	        int size = object.size();
	        System.out.println("Size of linked list = " + size); //o/p :  3
	 
	        // Get and set elements from linked list
	        Object element = object.get(2);
	        System.out.println("Element returned by get() : " + element);   //Bhushan
	        object.set(2, "Y");
	        System.out.println("Linked list after change : " + object);     // o/p : [Amol, Emirates, Y]
	    }
}
