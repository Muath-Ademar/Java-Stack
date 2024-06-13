
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
public String getRandomLetter(){
        Random rand = new Random();
        String [] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        
            return letters[rand.nextInt(26)];

    
}

public String generatePassword(){
    Random rand = new Random();
    String password = "";
        for (int i = 0; i<8; i++){
            password = password + getRandomLetter();
        }
        return password;
}
public ArrayList<String> setPassword(int length){
    ArrayList<String> passwordSet = new ArrayList<String>();
    
    for (int i = 0; i < length; i++){
        passwordSet.add(generatePassword());
    }
    return passwordSet;
}
}




