import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            try {
                input.reset();
                System.out.println("Please, enter your roll (ex. 2d6): ");
                String userInput = input.nextLine();
                String[] rollValues = userInput.split("d");

                int dice = Integer.parseInt(rollValues[1]);
                int roll = Integer.parseInt(rollValues[0]);
                Random rand = new Random();
                int total = 0;
                for(int i = 0; i < roll; i++) {
                    int result = (rand.nextInt(dice) + 1);
                    total = result + total;
                    System.out.println("Your roll is: " + result);
                }
                System.out.println("The result is: " + total);

            } catch(Exception e){
                System.out.println("Incorrect input! " + e.getMessage());
            }
        }
    }
}
