package lotteryapp;
import java.util.Random;
/**
 * Mehraneh Hamedani - 30062786
 * AT3 - Activity2 - Create Lottery NO. and compare it with winningNumber to
 * calculate the prize of the winner.
 */
public class Lotto {
    // Declare variables
    private String companyName;
    private int[] numbers = new int[6];
    // Define default constructor
    public Lotto(){
        // Set "ABC Lottery Co." to the variable
         companyName = "ABC Lottery Co.";
         // Call method
         generateNumbers();
     }
    
     // Define overloaded costructor
     public Lotto(String name){
         // Set the variable with the argument
         companyName = name;
         // Call the method
         generateNumbers();
     }
     // Define this method to use a private variable in the other class
     public String getCompanyName(){
         return companyName;
     }
     // Define this method to use a private variable in the other class
     public int[] getNumbers(){
         return numbers;
     }
     // Define a method to generate random numbers and asign them to an array
     private void generateNumbers(){
         // Create an object
         Random rand = new Random();
         // Loop to to generate random numbers and asign them to an array
         for(int i = 0; i < 6; i++){
             // Assign Random numbers between 1 to 7 to an int variable
             int randNumber = rand.nextInt(1,8);
             numbers[i] = randNumber;
         }
         
     }
      // Define a method 
     public String playLotto(int[] winningNumbers){
        String result = "";
        int counter = 0;
        // Loop all indices of the arrays
        for (int j = 0; j < 6; j++){
            // Condition to compare each number of the arrays is equal or not
            if(winningNumbers[j] == numbers[j]){
                // Increament the counter if it has any equal numbers
                ++counter;   
            }
        }
        // Loop to check the counter variable
        switch (counter) {
            case 0:// If counter is 0 the dispaly "Prize is $0.0"
                result = "Prize is $0.0";
                break;// Exit from the switch loop
            case 1: // If counter is 1 the dispaly "Prize is $100.0"
                result = "Prize is $100.0";
                break;// Exit from the switch loop
            case 2: // If counter is 2 the dispaly "Prize is $200.0"
                result = "Prize is $200.0";
                break;// Exit from the switch loop
            case 3: // If counter is 3 the dispaly "Prize is $400.0"
                result = "Prize is $400.0";
                break;// Exit from the switch loop
            case 4: // If counter is 4 the dispaly "Prize is $800.0"
                result = "Prize is $800.0";
                break;// Exit from the switch loop
            case 5: // If counter is 5 the dispaly "Prize is $1600.0"
                result = "Prize is $1600.0";
                break;// Exit from the switch loop
            case 6: // If counter is 6 the dispaly "Prize is $3200.0"
                result = "Prize is $3200.0";
                break;// Exit from the switch loop
            default: 
                break;// Exit from the switch loop
        }
       // Return the result
        return result;
     }
}
