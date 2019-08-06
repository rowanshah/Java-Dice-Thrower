package assignment2;
import java.util.*;

public class Dice {
    private static Scanner sc; // global variable to avoid resource leak
    //main function defined below 
	public static void main(String[] args) {
        sc = new Scanner(System.in);
        int sides;
        int rolls;
        //loop defined below 
        while(true){
            try{
            	System.out.println("---------------------------------------------------");
                System.out.println("Welcome to the program! \nEnter the number of sides of the dice:");
                //input from the user
                sides = sc.nextInt();
                System.out.println("Please enter the Number of throws:");
                //input from the user
                rolls = sc.nextInt();
                if((2 <= sides) && (rolls % sides == 0) && (0 < sides)){
                    break;
                }
                else{
                    System.out.println("The number of sides should be an integer bigger " +
                            "than one and the number of throws needs to be an integer multiple of the number of sides\n");
                    continue;
                }
            }
            catch (InputMismatchException e){
            	// TODO: handle exception
                sc.nextLine();
                System.out.println("The data entered is incorrect! Please try again.");
            }
        }
        
        int [] diceThrows = new int[sides];
        //random number generated
        Random randGen = new Random();
        for(int i = 1; i <= rolls; i++){
        	//counts the number of times each side has been rolled 
            int thisThrow = randGen.nextInt(sides);
            diceThrows[thisThrow] = diceThrows[thisThrow] + 1;
        }
        //prints out the number of the times each side has been rolled
        for (int i = 1; i <= diceThrows.length; i++){
            System.out.println("Side " + (i) + ": " + diceThrows[i-1]);
        }

    }
}

