
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
public class ArrayMethods {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> myArray = new ArrayList<>();
        
        for(int i = 1; i <= 10 ; i++){
            myArray.add(i);
        }
        
        System.out.println(getTotal(myArray));
        System.out.println(getAverage(myArray));
        System.out.println(getHighest(myArray));
        System.out.println(getLowest(myArray));
    }
    
    public static int getTotal(ArrayList<Integer> myNumbers){
        
        int total = 0;
        
        for(int i = 0; i < myNumbers.size(); i++){
            total = total + myNumbers.get(i);
        }
        return total;
    }
    
    public static double getAverage(ArrayList<Integer> myNumbers){
        
         int total = 0;
        
        for(int i = 0; i < myNumbers.size(); i++){
            total = total + myNumbers.get(i);
        }
        double average = total / myNumbers.size();
        
        return average;
    }
    
    public static int getHighest(ArrayList<Integer> myNumbers){
        
        int highestNumber = myNumbers.get(0);
        
        for(int i = 0; i < myNumbers.size(); i++){
            if(myNumbers.get(i) > highestNumber){
                highestNumber = myNumbers.get(i);
            }
        }
        
        return highestNumber;
    }
    
        public static int getLowest(ArrayList<Integer> myNumbers){
        
        int lowestNumber = myNumbers.get(0);
        
        for(int i = 0; i < myNumbers.size(); i++){
            if(myNumbers.get(i) < lowestNumber){
                lowestNumber = myNumbers.get(i);
            }
        }
        
        return lowestNumber;
    }
}
