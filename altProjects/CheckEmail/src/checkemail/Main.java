/* Main.java
 * last edited August 2, 2021, by A. Emmanuel.
 * This file has the main class for the Check edu email project.
 * For course CSCI 112.
 * Professor Chuck Herbert.
 */

package CheckEmail.src.checkemail;


import java.util.*;

// Start of Main().
public class Main {
    public static void main(String[] args) {
        // Scanner to read user input. 
        Scanner userInput = new Scanner(System.in);
        // Display to user to enter email.
        System.out.println("Enter email: ");
        // store value in email.
        String email = userInput.nextLine();
        enterData(email);
        userInput.close();   
    }

    // Start of enterData().
    public static void enterData(String email){
        // Create Scanner.
        Scanner userInput = new Scanner(System.in);
                
        

        // Store user email and password. 
        String userReEnterEmail;
        String passWord;

        // to confirm if user email ends with edu.
        String[] checkEmail = new String[4];      
        String[] username = new String[4];
        
        // store username and edu domain.
        username = email.split("@");
        checkEmail = username[1].split("\\.");

        if(!checkEmail[1].equals("edu")){// If edu is not the domain give user the option to re enter.
            System.out.println("Email was not a school email do you want to try again? y or n: ");
            userReEnterEmail = userInput.nextLine();
            if(userReEnterEmail.startsWith("y") || userReEnterEmail.startsWith("Y")){
                System.out.println("Enter your school email: ");
                email = userInput.nextLine();
                enterData(email);
            }
            else{
                System.out.println("Maybe next time.");
            }
        }// If edu is the domain show username and ask for new password.
        else if(checkEmail[1].equals("edu")){
            System.out.println();
            System.out.println("Your username is: " + username[0]);
            System.out.println("Enter a new password: ");
            passWord = userInput.nextLine();
        } 
        // close scanner.
        userInput.close();
    } // end of enterData().
} // end of Main().
