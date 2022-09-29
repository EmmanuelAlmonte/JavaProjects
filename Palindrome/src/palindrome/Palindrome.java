/* Palindrone.java
 * last edited August 2, 2021, by A. Emmanuel.
 * This file has the main class for the Recursive Palindrone Project.
 * This file also contains the boolean method CheckPalindroneWord.
 * For course CSCI 112.
 * Professor Chuck Herbert.
 */


package Palindrome.src.palindrome;



public class Palindrome {
    // Start of Class Main.
    public static void main(String[] args) {
        // Create an array of Strings.
        String[] arrayOfString = {"cat", "dog", "stray", "racecar", "ABCDCBA"};
        // Iterate through array. 
        for(int i = 0; i<arrayOfString.length; ++i){
            // If boolean method returns true display to user that word is palindrome.
            if(CheckPalindromeWord(arrayOfString[i])){
                System.out.println(arrayOfString[i] + " is a palindrome.");
            }
            // Display to user that word is not a planidrome.
            else{
                System.out.println(arrayOfString[i] + " is not a palindrome.");
            }
        }
    }// End of main().

    // start of CheckPalindromeWord().
    public static boolean CheckPalindromeWord(String word){
        // if the word given is 0 or a 1 word will be palindrone.
        if(word.length() == 0 || word.length() == 1){
            return true;
        }

        if(word.charAt(0) == word.charAt(word.length()-1)){
            // Keep iterating over the characters in the word until palindrone is determined
            return CheckPalindromeWord(word.substring(1, word.length()-1));
        }
        // If word is not a palindrome return false.  
        return false;
    }// End of CheckPalinedromeWord().
}


