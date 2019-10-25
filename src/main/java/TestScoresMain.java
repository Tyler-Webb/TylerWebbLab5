import java.util.ArrayList;
import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tyler
 */
public class TestScoresMain {
    
    public static void main(String[] args) {
        ArrayList<Double> randomScores = new ArrayList<>();
        Random rand = new Random();
        
        for(int i = 0; i <= 4; i++){
            randomScores.add(rand.nextDouble() * 100);  
        }
        /*To test the constructor throwing the exception I changed the "100"
        limit to something higher so there was a chance it could happen
        */
        TestScores myScores = new TestScores(randomScores);
        
        System.out.println("Average is: " + myScores.getAverage());
    }
}
