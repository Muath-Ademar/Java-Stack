
import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {

    // getTenRolls
    // Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive. 
    // To get a random integer, you can use the nextInt method of the Random class. Random Class documentation
    public ArrayList<Integer> getTenRolls() {
    ArrayList<Integer> randomNum = new ArrayList<Integer>();
    Random randMachine = new Random();
    for (Integer i = 0; i<10; i++){
    randomNum.add(randMachine.nextInt(20));
}
return randomNum;

}
public Char  getRandomLetter(){
        Random randMachine = new Random();

    String letters = "abcdefghijklmnopqrstuvwxyz"
    String [] alphabet = new String [26];
    for (int i = 0; i < alphabet.length; i++){
            return alphabet.get(randMachine.nextInt(26));

    }
    
}



}
