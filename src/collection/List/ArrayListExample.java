package collection.List;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	
	 public static void main(String[] args)
             throws IOException
{
// size of ArrayList
int n = 5;

//declaring ArrayList with initial size n
ArrayList<Integer> arrli = new ArrayList<Integer>(n);


// Appending the new element at the end of the list
for (int i=1; i<=n; i++)
  arrli.add(i);

// Printing elements
System.out.println("ArrayList 1 with 5 element"+arrli);


Iterator<Integer> iterator=arrli.iterator();


//Iterator methods hasNext(),next(),remove()

while(iterator.hasNext()){
	int i =(int) iterator.next();
	//System.out.println(iterator.next());
	if(i % 2==0){
		iterator.remove();	
	//	arrli.add(22);    throw java.util.ConcurrentModificationException
	}	
}
System.out.println("ArrayList 1 after Iterator remove operation"+arrli);

System.out.println("ArrayList positional operations");
/*ArrayList positional operations*/


ArrayList< Integer> arrayList= new ArrayList<Integer>();



arrayList.add(5);
arrayList.add(8);
arrayList.add(10);
arrayList.add(1);


System.out.println("ArrayList 2 :"+arrayList);

//addAll(index,Collection)

arrayList.addAll(2,arrli);

System.out.println("ArrayList 2 after addall operation at index 2 :"+arrayList);

//add(index,element)
arrayList.add(1, 11);
System.out.println("ArrayList 2 after add operation at index 1 :"+arrayList);

//get(index)
int j=arrayList.get(1);
System.out.println("ArrayList 2 Element at Index 1 :"+j);

//set(index,Object)
arrayList.set(2, 12);
System.out.println("ArrayList 2 after set Element at Index 2 :"+arrayList);


System.out.println("ArrayList Search operations");

/*ArrayList Search operations*/


//indexOf(object)

System.out.println("Index of 12 in ArrayList 2 is : "+arrayList.indexOf(12));

//lastIndexOf(object)

System.out.println("Index of 1 in ArrayList 2 is : "+arrayList.lastIndexOf(1));


System.out.println("ArrayList Range-View  operations");

/*ArrayList Range-View  operations*/

List sublist=arrayList.subList(2, 5);
System.out.println("ArrayList 2 sublist between index 2 and 5 :"+sublist);
}
}
