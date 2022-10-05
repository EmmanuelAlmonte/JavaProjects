/* Created By: Chuck Herbert.
* Edited By: Emmanuel Almonte.
* Selection sort and insertion sort were add to this project
* On Top of the Bubble Sort.
* Course CSCI 112.
* reading, sorting and writing data in text files
* this program reads data from a text file, sorts the data,
* last edited 08/09/2021 By Emmanuel Almonte.
* Professor Chuck Herbert.
*/

package SortingMethods.src.sortingmethods;

import java.util.Scanner;

public class SortingMethods {
    
    // the main method call methods to perform each part of the program
public static void main(String[] args) throws Exception

    {
        String[] tutorials = new String[20];     // an array to hold a list of tutorials
        int count;		// the number of elements in the that are used

        // read data into tutorials[] line by line and return count
        count = readLines(tutorials); 
        
        // print the array on the screen
        System.out.println("The original array:\n");
        displayLines(tutorials, count);
        
        //to sort the array 
        selectionSort(tutorials);

        // print the array on the screen  line by line using the selection sort 
        System.out.println("\nThe sorted array, in Selection Sort:\n");
        displayLines(tutorials, count); 

        // write the array to a data file line by line.
        writeLines(tutorials, count, "SelectionSort");
        
        // 
        insertionSort(tutorials);

        // print the array on the screen  line by line using the Insertion sort.
        System.out.println("\nThe sorted array, in Insertion Sort:\n");
        displayLines(tutorials, count);
        
        // write the array to a data file line by line
        writeLines(tutorials, count, "InsertionSort");

    } // end main()        
/*************************************************/
    
    /* This method reads data from the file into the array. 
     * We want our array to work with up to 100 elements  
     * Each line from the file will be one element in the array.
     * 
     * The parameter refers to the array in the main method.  
     * 
     * The method returns the number of elements it uses.
     */
     public static int readLines(String[] lines) throws Exception
    {
        int count = 0; // number of array elements with data
        
        // Create a File class object linked to the name of the file to read
        java.io.File unsorted = new java.io.File("unsorted.txt");

        // Create a Scanner named infile to read the input stream from the file
        Scanner infile  = new Scanner(unsorted);
   
        /* This while loop reads lines of text into an array. it uses a Scanner class 
         * boolean function hasNextLine() to see if there another line in the file.
         */
        
        while ( infile.hasNextLine() ) 
        {
            // read a line and put it in an array element
            lines[count] = infile.nextLine();
            count ++;  // increment the number of array elements with data
            
        } // end while
        
        infile.close();
        return count;    // returns the number of items used in the array.
    
    } // end readList()
/*************************************************/
    
    /* This method sorts an array of Strings line by line 
     * using a simple bubble sort. 
     * 
     * The first parameter refers to the array in the main method.  
     * The second parameter is the number of elements in the array that 
     * actually contain data
     */
    
    public static void sortStringArray(String[] a, int count)
    {
        boolean swapped;    //  keeps track of when array values are swapped 
        int i;              // a loop counter
        String temp;         // catalyst variable for String swapping
        
        // Each iteration of the outer do loop is is one pass through the loop. 
        // If anything was swapped, it makes another pass
        do     
        {
            // set swapped to false before each pass
            swapped = false;
            
            // the for loop is a pass through the array to the second to last element
            for( i=0 ; (i < count-1) ; i++ )    
            {
                // if the two items are out of order  see page 16 for String compareTo() 
                if(a[i+1].compareTo(a[i]) < 0)	 
                {
                    // swap the two items ans set swapped to true    
                    temp  = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    
                    swapped = true;    
		
		}  // end if
            } // end for
            
        // the outer loop will repeat if a swap was made  – another passs
        } while (swapped);	
        
    } // end sortStringArray
/******************************************************************/
// Start of the of selectionSort.
    public static void selectionSort(String[] array) throws Exception
    {   
        String temp_spot; // This will be the spot where the smallest from what is left of the list.
        int minimum; // Smallest value's location.
        for(int i = 0; i<array.length; i++){
            minimum = i;// set the minimum as the first value in the list.
        
           for(int k = i+1; k<array.length - 1; k++){ //iterate to the end of the list.
               
            if(array[k].compareTo(array[minimum])< 0){
                   minimum = k;// This is the location of the minimum for this iteration.
                }

            }
            // Swap the the value wiht the minimum
            temp_spot = array[i];
            array[i] = array[minimum];
            array[minimum] = temp_spot;
        } //end of for loop.
    } // end of selectionSort.
    public static void insertionSort(String[] array) throws Exception
    {
        for(int i=1;i<array.length;i++) // Iterate through the whole list.
        {

            int sorted = i-1; // this would be an item in the sorted list.
            String next_value = array[i]; // The next value that will be inserted into sorted list. 
            
            while(sorted>=0 && array[sorted].compareTo(next_value)< 0)// Start from the current value to the one to the left.
            {
                array[sorted+1] = array[sorted]; // Move item to the right.
                sorted = sorted-1; // move to the left of the current item.
            }
            array[sorted+1] = next_value; // Insert the value into correct spot.
        }// end for loop.
    }// end insertionSort.

        /*This method prints an array of Strings on the screen.  
         * The first parameter refers to the array in the main method.  The second 
         * parameter is the number of elements in the array that actually contain data
         */
        public static void displayLines(String[] lines, int count)
        {
            int i;  // loop counter
        
            // iterate the elements actually used
            for ( i=0; i < count; i++)    
                System.out.println(lines[i]);
        
        } // end displayLines()
/*************************************************/

/* This method writes an array of Strings to a text data file.  
 * The first parameter refers to the array in the main method. The second parameter
 * is the number of elements in the array that actually contain data
 */

        public static void  writeLines(String[] lines, int count, String fileName) throws Exception
        {
            // create a File class object and give the file the name tutorials.txt
            java.io.File tut  = new java.io.File((fileName)+".txt");
            // Create a PrintWriter text output stream and link it to the file x
            java.io.PrintWriter outfile  = new java.io.PrintWriter(tut);
            
            int i;  // loop counter
            
            // iterate the elements actually used
            for ( i=0; i < count; i++)    
                outfile.println(lines[i]);

            outfile.close();            
            
        } // end writeTextArray()
/*************************************************/

} // end class        
