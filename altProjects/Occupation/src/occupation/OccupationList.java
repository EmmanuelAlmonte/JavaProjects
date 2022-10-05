/* Occupation.java
* This file contains the object class OccupationList.
* Creates an array of Occupations. 
* last edited November July 19 by A. Emmanuel
* This file has the Occupation List class to modify Occupation. 
* course CSCI 112
*/





package Occupation.src.occupation;

import java.util.*;

public class OccupationList {
    // Data members of this class. 
    private Occupation[] occupationList = new Occupation[1000]; // This is the array for the Occupation List.
    private int count; // This will count how many elements are in the list. 
    // end of properties. 

    // Start of methods.
    // Constructor with no parameters.
    public OccupationList(){

    }

    // method to store all the data from a text file. 
    public void storeOccupation() throws Exception 
    { 
        // the loop counter 
        int i = 0;

        // variables for the properties of each occupation. 
        String occ; // Occupation code
        String title; // Occuapation Title
        Double employed; // Number of employed.
        Double hourly; // hourly rate.
        Double annual; // Annual rate.

        // File class object.
        java.io.File OccupationFile = new java.io.File("occText.txt");

        // Scanner object
        Scanner checkFile = new Scanner(OccupationFile);

        // This loop Reads the from a file that hold the Occupation list
        while ( checkFile.hasNextLine() )
        {
            occ = checkFile.nextLine();
            title = checkFile.nextLine();
            employed = Double.parseDouble(checkFile.nextLine());
            hourly = Double.parseDouble(checkFile.nextLine());
            annual = Double.parseDouble(checkFile.nextLine());

            // create each occuaption witht the occupation constructor.
            occupationList[i] = new Occupation(occ, title, employed, hourly, annual);
            
            // update counter.
            i+= 1; 
        } //end while.

        // close file.
        checkFile.close();

        // update the count.
        count = i;
    }// end showOccupation.
    
    // Displays all the Occuaptions that storeOccuation has.
    public void displayData() {
        System.out.println("All Occupations listed below.\n");
        for(int i = 0; i < count; i++){
            System.out.print(occupationList[i].toString());
        }// end of for loop.
    
    }// end of displayData.

    // method to search through the data using the OCC code.
    public void searchList() {
        // boolean determines whether the value is in the list.
        boolean occCodeMatch = false; 
        // Scanner for user input.
        Scanner userInput = new Scanner(System.in);
        // Display in order for user to enter occ Code. 
        System.out.print("Enter an OCC code: ");

        // Store user input. 
        String occCode = userInput.nextLine();

        // close the scanner.
        userInput.close();

        // for loop to search through the list.  
        for(int m = 0;(!occCodeMatch) && (m < occupationList.length); m ++){

            // if the occupation code matches then it will print out the code entered
            Occupation[] occInList = occupationList;
            if (occInList[m].getOcc().equals(occCode) ){
                System.out.print("Found occupation, Listed Below:" + "\n" + occupationList[m].toString());
                occCodeMatch = true;
            }
            else{
                continue;
            }
        }
        // if the for loop didn't find the OCC code then tell user none was found.
        if ( occCodeMatch == false){
            System.out.println("No OCC code found.");
        }
    }// end of searchList

}// end class.

