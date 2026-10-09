
import java.util.*;
class Main {

     public static void main(String [] args)
     {
           StringBuilder sb=new StringBuilder();
          String s = "Hello the vision is power";

          String str[]=s.split("\\s+");

          for(int i=0;i<str.length;i++)
               {

                    if("vision".equals(str[i]))
                    {
                         String word= str[i];
                         String st="";
                         for(int j=word.length()-1;j>=0;j--)
                              {
                                   st=st+ word.charAt(j);
                              }
                           sb.append(st);
                    }else{

                        
                          sb.append(str[i]);
                    }

                    if(i< str.length-1)
                    {
                         sb.append(" ");
                    }
                    
               }
          System.out.println(sb);
     }
    
}
