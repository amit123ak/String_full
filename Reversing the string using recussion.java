// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;
class Main {

  public static  void reverse( char ch[], int start, int end)
      {

        if(start>=end)
        {

             return;
        }else{
               
            char  temp = ch[start];
              ch[start]=ch[end];
              ch[end]=temp;

              
        }

            reverse(ch,start++,end-1);
            
      }
      
    public static void main(String[] args) {
          char ch[] ="amit".toCharArray();
             reverse(ch,0,ch.length-1);

          System.out.println(new String(ch));

                

  

      
      
       
        
    }
}
