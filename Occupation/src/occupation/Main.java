/* Occupation.java
* last edited November July 19 by A. Emmanuel
* This file has the main class for the Occupation Project.
* course CSCI 112 
*/



package Occupation.src.occupation;


public class Main {
    // start of class Main. 
    public static void main(String[] args) throws Exception {
        // start of main().
        // Created an instance of Occupation and named it first OccupationList.
        OccupationList firstList = new OccupationList();

        // store the data.
        firstList.storeOccupation();

        // display data.
        firstList.displayData();

        // Search list of occupation.
        firstList.searchList();
    }//end of main().

}//end of class main.
