import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Please, enter which dice do you want to use: ");
                int dice = input.nextInt();
                System.out.println("Please, enter how much dices you want to roll: ");
                int roll = input.nextInt();
                Random rand = new Random();
                int total = 0;
                for(int i = 0; i < roll; i++) {
                    int result = (rand.nextInt(dice) + 1);
                    total = result + total;
                    System.out.println("Your roll is: " + result);
                }
                System.out.println("The result is: " + total);
                input.close();

            } catch(Exception e){
                System.out.println("Incorrect input! Please, enter a number!");
            }
        }
    }
}
