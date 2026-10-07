// Online Java Compiler (Editor)
// Write and run Java online using this editor.
//Reverse a string and print only repetitive characters,
//together with the occurrence of vowels in the
//repetitive characters

import java.util.*;
class Main {
    public static void main(String[] args) {
    String str = "programming";
   StringBuilder str2= new StringBuilder(str).reverse();
   System.out.println(str2);
   HashMap<Character,Integer> map=new HashMap<>();
   for(int i=0;i<str.length();i++)
        {
             char ch1= str2.charAt(i);
             map.put(ch1, map.getOrDefault(ch1,0)+1);
          
        }
       int count=0;
     for(Map.Entry<Character,Integer> entry:map.entrySet())
          {
  
           char ch=  entry.getKey();

               if(entry.getValue()>1)
               {
                    System.out.println(entry.getKey());
               }

               if("aeiou".indexOf(ch)!=-1)
               {
                    count++;
               }
                    
               
          }
         System.out.println(count);




             
       

         
    }
}
