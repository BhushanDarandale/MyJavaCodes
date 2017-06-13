package collection.ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayListExam {

	/*
			
			Synchronized ArrayList
			
			1. Collections.synchronizedList() method.
            2. Using CopyOnWriteArrayList.
	
	
	
	
	*/
	
	
	
	
	public static void main (String[] args)
    {
		
//Collections.synchronizedList() method.		
       
		List<String> list =
           Collections.synchronizedList(new ArrayList<String>());
 
        list.add("Bhushan");
        list.add("Java");
        list.add("Developer");
 
        synchronized(list)
        {
            // Compulsory in synchronized block
            Iterator<String> it = list.iterator();
 
            while (it.hasNext()){
            	System.out.println(it.next());  
            }
        }
        System.out.println(list);
    
	
	
	
//Using CopyOnWriteArrayList.	
	
	
	
     // creating a thread-safe ArrayList.
        CopyOnWriteArrayList<String> threadSafeList =
            new CopyOnWriteArrayList<String>();
 
        // Adding elements to synchronized ArrayList
        threadSafeList.add("Amol");
        threadSafeList.add("Software");
        threadSafeList.add("Developer");
 
        System.out.println("Elements of synchronized ArrayList :");
 
        // Iterating on the synchronized ArrayList using iterator.
        Iterator<String> it = threadSafeList.iterator();
 
        while (it.hasNext())
        {
            String str = it.next();
            System.out.println(str);
           // it.remove();  //if we try to modify CopyOnWriteArrayList through iterator’s own method 
                             //Error : java.lang.UnsupportedOperationException
        }
    
	
	
    }
}
