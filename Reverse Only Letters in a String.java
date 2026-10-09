//Problem Statement: Reverse Only Letters in a String

//Problem: Given a string containing English letters and special characters, reverse only the letters in the string while keeping all special characters at their original positions.
import java.util.*;
class Main {


     
    public static void main(String[] args) {

     char ch []="a,b$c".toCharArray();
         int left =0;
         int right =ch.length-1;

         while(left<=right)
              {

                    
               while(!Character.isLetter(ch[left]))
                    {
                         left++;
                    }
                   while(!Character.isLetter(ch[right]))
                        {
                             right--;
                        }
                  char temp = ch[left];
                   ch[left]=ch[right];
                   ch[right]=temp;
                   left++;
                   right--;
               
              }

         System.out.println(new String(ch));
     

         
             
       

         
    }
}
