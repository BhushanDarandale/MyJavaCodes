package collection.Map;

import java.util.HashMap;
import java.util.Map;
 
public class HashMapExample
{
    public static void main(String[] args) 
    {
     
        HashMap<String, Integer> map = new HashMap<>();
         
        print(map);
        map.put("Bhushan", 10);
        map.put("Gaurav", 30);
        map.put("Suraj", 20);
         
        System.out.println("Size of map is:- " + map.size());   //Size of map is:- 3
     
        print(map);                                             //{Suraj=20, Bhushan=10, Gaurav=30}
        if (map.containsKey("Bhushan")) 
        {
            Integer a = map.get("Bhushan");
            System.out.println("value for key \"Bhushan\" is:- " + a);   //value for key "Bhushan" is:- 10
        }
         
        map.clear();
        print(map); 
    }
     
    public static void print(Map<String, Integer> map) 
    {
        if (map.isEmpty()) 
        {
            System.out.println("map is empty");  //map is empty
        }
         
        else
        {
            System.out.println(map);
        }
    }
}