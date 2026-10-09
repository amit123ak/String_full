
import java.util.*;
class Main {

     public static void main(String [] args)
     {
           StringBuilder sb=new StringBuilder();
          String st="Hello World Selenium";
          String str[]=st.split("\\s+");
          
          for(int i=0;i<str.length;i++)
               {
                 String word=str[i];
                    for(int j=word.length()-1;j>=0;j--)
                         {
                              sb.append(word.charAt(j));
                         }
                     if(i<str.length-1)
                     
                     {
                          sb.append(" ");
                     }
                    
               }
          System.out.println(sb);

          
     }
    
}
