import java.util.*;
class hashmap
{
public static void main(String args[])
{
HashMap<String,Integer> map = new HashMap<String,Integer>(); 
map.put("java",1);
map.put("c",20);
map.put("c++",30);
map.put("ada",40);
HashMap<String,Integer> map2=new HashMap<>();
map2.put("c#",50);
map2.put("python",60);
System.out.println("Is the key '5' present? " +  map.containsKey(5)); 
System.out.println("Is the key '5' present? " +  map.containsKey(10)); 
System.out.println("Is the value 'World' present? " + map.containsValue("c"));
System.out.println("Is the map empty? " + map.isEmpty()); 
System.out.println("The set is: " + map.entrySet());
System.out.println("The Value is: " + map.get(10));
System.out.println("The set is: " + map.keySet());
System.out.println("The size of the map is " + map.size()); 
map.put("J2SE",15); 
HashMap<String,Integer> new_hash_map = new HashMap<String,Integer>(); 
new_hash_map.putAll(map); 
  System.out.println("The cloned map look like this: " + map.clone());   
} 
}  