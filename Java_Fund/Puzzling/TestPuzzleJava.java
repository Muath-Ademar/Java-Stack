import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		String randomLetters = generator.getRandomLetter();
		String randomPassword = generator.generatePassword();
		ArrayList<String> newPassword = generator.setPassword(8);
		System.out.println(randomRolls);
		System.out.println("the Random Letter is: " + randomLetters);
		System.out.println("Password: " + randomPassword);
		System.out.println("New Password: " + newPassword );
    	        //..
		// Write your other test cases here.
		//..
	}
}
