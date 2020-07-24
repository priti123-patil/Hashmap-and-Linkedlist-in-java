import java.util.*;
class hashset
{
public static void main(String args[])
{
HashSet<String> arr=new HashSet<String>();
arr.add("collection framework in java:");
arr.add("Arraylist");
arr.add("Vector");
arr.add("List");
HashSet<String> arr2=new HashSet<String>();
arr2.add("Linked List");
arr2.add("Vector");
System.out.println("\nDoes set 1 contains set 2: "+ arr.containsAll(arr2)); 
System.out.println("Elements in hashset: " +arr);
System.out.println();
boolean value = arr.equals(arr2); 
  
        // print the value 
        System.out.println("Are both set equal: "+ value); 
boolean flag =  arr.contains("List");
        if (flag == true) {
            System.out.println("hashset contains element list");
System.out.println();
        }else{
            System.out.println("hashset doesn't contains element list");
System.out.println();
        }
arr.remove(2);
System.out.println("hashset After Removing Element at index 2= " +arr);
System.out.println();
HashSet cloned_set = new HashSet(); 
  
        // Cloning the set using clone() method 
        cloned_set = (HashSet)arr.clone(); 
  
        // Displaying the new Set after Cloning; 
        System.out.println("The new set: " + cloned_set); 
System.out.println("Size of hashset is :" + arr.size());
System.out.println();
Iterator value2 = arr.iterator(); 
  
        // Displaying the values after iterating through the set 
        System.out.println("The iterator values are: "); 
        while (value2.hasNext()) { 
            System.out.println(value2.next()); 
            }
Object[] object = arr.toArray();
for(int i=0;i<object.length;i++){
System.out.println("Value at index "+i+" of Array coverted from hashset= "+object[i]);
System.out.println();
}
System.out.println("HashCode value: " + arr.hashCode()); 
boolean flag1 = arr.isEmpty();

        if(flag1==true){
            System.out.println("ArrayList is Empty");
        }

        else{
            System.out.println("ArrayList is not Empty");
        }
        System.out.println();
arr.clear();
System.out.println("empty arraylist after using clear method: " +arr);
}
}