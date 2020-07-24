import java.io.*; 
import java.util.*;
class CreateFile 
{ 
static final int MAX_CHAR=256;
static int countChar(String str) 
{

int count5[] = new int[MAX_CHAR]; 
int len = str.length(); 
for (int i2 = 0; i2 < len; i2++) 
            count5[str.charAt(i2)]++; 
char chz[] = new char[str.length()]; 
for (int i2 = 0; i2 < len; i2++) 
{ 
chz[i2] = str.charAt(i2); 
int find = 0; 
 for (int j2 = 0; j2 <= i2; j2++) { 
 if (str.charAt(i2) == chz[j2])  
                    find++;               
 } 
if (find == 1)  
System.out.println("Number of Occurrence of " + 
str.charAt(i2) + " is:" + count5[str.charAt(i2)]);             
}
return 0;  
}
public static void main(String[] args) throws IOException 
{ 
// Accept a string  
String str = "File Handling in Java using " + " FileWriter and FileReader in java" + "Java FileWriter and FileReader classes are used to write and read data from text files they are Character Stream classes It is recommended not to use the FileInputStream and FileOutputStream classes if you have to read and write any textual information as these are Byte stream classes " + "FileWriter is useful to create a file writing characters into it This class inherits from the OutputStream class The constructors of this class assume that the default character encoding and the default byte buffer size are acceptable To specify these values yourself construct an OutputStreamWriter on a FileOutputStream" + "FileWriter is meant for writing streams of characters For writing streams of raw bytes consider using a FileOutputStream " +"Constructors FileWriter File file  Constructs " + " a FileWriter object given a File object FileWriter File file boolean append  constructs a FileWriter object given a File object FileWriter FileDescriptor fd  constructs a FileWriter object associated with a file descriptor FileWriter String fileName constructs a FileWriter object given a " + " file name FileWriter String fileName Boolean append  Constructs a FileWriter object given a " + " file name with a Boolean indicating whether or not to append the data writing " + "This class inherit from the InputStreamReader Class The constructors " + "of this class assume that the default character encoding and the default byte buffer size are appropriate To specify these values yourself construct an InputStreamReader on a FileInputStream " + "FileReader is meant for reading streams of characters " + " For reading streams of raw bytes consider using a FileInputStream ";
FileWriter fw=new FileWriter("test.txt");  
for (int i = 0; i < str.length(); i++) 
fw.write(str.charAt(i));
System.out.println("Writing successful"); 
fw.close();
int ch; 
FileReader fr=null; 
try{ 
fr = new FileReader("test.txt"); 
} 
catch (FileNotFoundException fe) 
{ System.out.println("File not found"); 
} 
int vowels=0,consonants=0,p=0;
while ((ch=fr.read())!=-1)
{//System.out.print((char)ch);
}
int count = 0,count1=0;    
char ch1;            
str=str.toLowerCase();   
for(int k = 0; k < str.length(); k++) {    
            if(str.charAt(k) != ' ')    
            {
               count++;
            }    
            if(str.charAt(k) == 'a' || str.charAt(k) == 'e' || str.charAt(k) == 'i' || str.charAt(k) == 'o' || str.charAt(k) == 'u') {  
                vowels++;
            }
            else
            {
            consonants++;
            }
}
char ch2[]= new char[str.length()];     
for(int l=0;l<str.length();l++)  
            {  
                ch2[l]= str.charAt(l);  
                if( ((l>0)&&(ch2[l]!=' ')&&(ch2[l-1]==' ')) || ((ch2[0]!=' ')&&(l==0)) )  
                    count1++;  
            }   
System.out.println("Total number of characters in a string: " + count);
System.out.println("Total number of vowels in test.txt file is = " +vowels);
System.out.println("Total number of consonants in test.txt file is = " +consonants);
System.out.println("Total number of words in test.txt file is= " +count1);
countChar(str);
fr.close(); 
} 
}