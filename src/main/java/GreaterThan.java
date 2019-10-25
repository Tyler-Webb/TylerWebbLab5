
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tyler
 */
public class GreaterThan {
    
    public static void main(String[] args) {
        final int n = 7; //because it's lucky?
        
        ArrayList<Integer> myNumbers = new ArrayList<>();
        
        for(int i = 1; i <= 10 ; i++){
            myNumbers.add(i);
        }

        isGreaterThan(myNumbers, n);
        
        
    }
    
   public static void isGreaterThan(ArrayList<Integer> numbers, int n){
       for (int i = 0; i < numbers.size(); i++){
           if(numbers.get(i) > n){
               System.out.println(numbers.get(i));
           }
       }
   }
}
    
