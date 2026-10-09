
import java.util.*;
class Main {


     
    public static void main(String[] args) {
//I Am Not String → g ni rtS toNmAI.
     char ch []="I Am  Not String".toCharArray();
         int left =0;
         int right =ch.length-1;

         while(left<right)
              {
                if(ch[left]==' ')
                {
                     left++;
                }
                else if(ch[right]==' ')
                {
                     right--;
                }else{


                           char temp= ch[left];
                           ch[left]=ch[right];
                           ch[right]=temp;
                            left++;
                            right--;
                      }
              }

                   
    
             


         


         System.out.println(new String(ch));
     

         
             
       

         
    }
}
