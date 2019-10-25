
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
public class TestScores {
    private double average;
    
    public TestScores(ArrayList<Double> myScores) throws IllegalArgumentException{
        
        double total = 0;
        
        for(int i = 0; i < myScores.size(); i++){
            if(myScores.get(i) < 0 || myScores.get(i) > 100){
                throw new IllegalArgumentException("Invalid test score");
            }
            else
            {
            total = total + myScores.get(i);
            }
        }
        double ScoreAverage = total / myScores.size();
        
        this.average = ScoreAverage;
        

    }
    
    public double getAverage(){
        return this.average;
    }
}
