// Online Java Compiler (Editor)
//Reverse words in a string while preserving the
formatting.
// Write and run Java online using this editor.
import java.util.*;
class Main {
    public static void main(String[] args) {

//Input:  "Hello   World Test"
//Outp

char  ch[]="Hello   World Test".toCharArray();
   int start=0;
   
    while(start< ch.length)
    {
       if(start< ch.length && ch[start]==' ')
       {
         start++;
         continue;
       }
           int  end=start;
           while(end<ch.length && ch[end]!=' ')
                            {
                             end++;
                            }
          int left = start;
           int right =end-1;
             while(left< right)
               {
                 char temp = ch[left];
                    ch[left]=ch[right];
                     ch[right]=temp;
  
                      left++;
                      right--;
               }
                     start=end;              


      
                                   
       }
    

  
   System.out.println(new String(ch));

  
                
        
    }
}
