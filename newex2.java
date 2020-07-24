import java.io.*;
import java.util.*;
class newex2
{
public static <T extends Object & Comparable<? super T>> T get_even_odd(List<? extends T> list,int begin, int end) {
            T even=0;
            T odd=0;
            for (++begin;begin<end;++begin) 
                if (begin%2==0) 
                     even++;
                    
return maxelem;
}
public static void main(String args[])
{
List<Integer> arr=Arrays.asList(2,4,6,7,8,9,90,78,41,56,79,45,65,85);
int x=newex.getMax(arr,0,arr.size());
System.out.println("maximal number:" +x);
}
}