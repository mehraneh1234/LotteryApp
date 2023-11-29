package lotteryapp;

/**
 * Mehraneh Hamedani - 30062786
 * AT3 - Activity2 - Create Lottery NO. and compare it with winningNumber to
 * calculate the prize of the winner.
 */
public class LotteryApp {
    public static void main(String[] args) {
        // Create two lotto objects
        Lotto lot1 = new Lotto();
        Lotto lot2 = new Lotto("WA Lottery");
        // Define the winning number
        int[] winningNumbers = {3, 5, 4, 3, 7, 1};
        // Define the null strings variable 
        String playResult = "";
        String playResult2 = "";
        // Assign the result of the method in other class
        playResult += lot1.playLotto(winningNumbers);
        playResult2 += lot2.playLotto(winningNumbers);
        // Display ### ABC Lottery Co. ###
        System.out.println("### " + lot1.getCompanyName() + " ###");
        // Display Winning numbers:
        System.out.print("Winning numbers:");
        // Loop to all indices of the array
        for(int i = 0; i < winningNumbers.length; i++){
            // Display all numbers in the array with an space between them.
            System.out.print(winningNumbers[i] + " ");
        }// print a blank line
        System.out.println();
        // Display "Lotto numbers: "
        System.out.print("Lotto numbers: ");
        // Loop in all indices of LotteryNumber array
        for(int i = 0; i < lot1.getNumbers().length; i++){
            // Display numbers of lottery number array with spaces
            System.out.print(" " + lot1.getNumbers()[i]);
        }// print a blank line
        System.out.println();
        
        // Display the result of the method in another class
        System.out.println(playResult);
        // print a blank line
        System.out.println();
        // Display ### WA Lottery Co. ###
        System.out.println("### " + lot2.getCompanyName() + " ###");
        // Display "Winning numbers:"
        System.out.print("Winning numbers:");
        // Loop in numbers of the winning number array
        for(int i = 0; i < winningNumbers.length; i++){
            // Display all the numbers in the array
            System.out.print(winningNumbers[i] + " ");
        }
        // Display a blank line
        System.out.println();
        // Display "Lotto numbers: "
        System.out.print("Lotto numbers: ");
        // Loop in numbers of lottery number array
        for(int i = 0; i < lot2.getNumbers().length; i++){
            // Display numbers of lottery number array with spaces between them
            System.out.print(" " + lot2.getNumbers()[i]);
        }// Display a blank line
        System.out.println();
        // Display the result of the method in another class
        System.out.println(playResult2);
    }
    
}
