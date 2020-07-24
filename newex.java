import java.io.*;
import java.util.*;
class newex
 {
public static <T extends Object & Comparable<? super T>> T getMax(List<? extends T> list,int begin, int end) {
        T maxelem=list.get(begin);
            for (++begin;begin<end;++begin) 
                if (maxelem.compareTo(list.get(begin)) < 0) 
                    maxelem = list.get(begin);
return maxelem;
}
public static void main(String args[])
{
List<Integer> arr=Arrays.asList(2,62,4,78,6,10,49,20,59,43,29,30,56,89);
int x=newex.getMax(arr,0,arr.size());
System.out.println("maximal number:" +x);
}
}