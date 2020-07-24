import java.util.*;
class linkedlist
{
public static void main(String args[])
{
LinkedList<String> l1 = new LinkedList<String>(); 
l1.add("A"); 
l1.add("B"); 
l1.addLast("C"); 
l1.addFirst("D"); 
l1.add(2, "E"); 
System.out.println(l1); 
l1.remove(3); 
l1.removeFirst(); 
l1.set(1,"F");
for (String str : l1)  
            System.out.print(str + " ");  
LinkedList sec_list = new LinkedList(); 
sec_list = (LinkedList) l1.clone();
System.out.println("Second LinkedList is:" + sec_list); 
System.out.println("The Object that is replaced is: " + l1.set(2, "G")); 
System.out.println("The element is: " + l1.get(2)); 
System.out.println("Does the List contains 'A': " + l1.contains("A"));
l1.push("Z");  
System.out.println(l1); 
String s = l1.pop(); 
System.out.println(s);
Collection<String> collect = new ArrayList<String>(); 
collect.add("A"); 
collect.add("Computer"); 
l1.addAll(collect); 
System.out.println("The first element is: " + l1.getFirst());
System.out.println("The last element is: " + l1.getLast());
System.out.println("The first element is: " + l1.removeFirst()); 
System.out.println("The last element is: " + l1.removeLast()); 
   l1.addLast("Last"); 
l1.add("L");
l1.add("M");
l1.add("N");
  System.out.println("The list is as follows:"); 
ListIterator list_Iter = l1.listIterator(2); 
while(list_Iter.hasNext()){ 
         System.out.println(list_Iter.next()); 
        }  
System.out.println("The first occurrence of F is at index: "  + l1.indexOf("F")); 
l1.clear(); 
System.out.println("List after clearing all elements: " + l1);
  
}
}

 
  
                      