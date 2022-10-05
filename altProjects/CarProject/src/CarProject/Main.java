/* Main.java
* This file contains the executable class for a project
* demonstrating the use of a car object
* last edited November 28, 2020 by C. Herbert
* The file declaring the Book class must be visible to this Main class.
* */
package CarProject;

public class Main {
    // start class Main
    public static void main(String[] args) {
	// start of main()
        // creating an instance of the class
        Car myCar = new Car(); // An instance of the class Car
        myCar.setModel("Toyota");// Setting the model of the instance
        myCar.setMake("Camry");// setting the make of the instance
        myCar.setCost(2500);// setting the cost of instance
        myCar.setMileage(130000); // setting mileage of instance
        myCar.setYear("2004");// setting the year of instance
        System.out.println(myCar.toString()); // Displaying all attributes using the toString method.

    }// end main()
}// end class Main
