/* Car.java
* This file contains the declaration for the Car class of objects,
* as used in a dealership
* last edited November 28, 2020 by A. Emmanuel
* The file declaring the Car class must be visible to this Main class.
*/
package CarProject;

// this is the class for the Car project
public class Car {
    // the following are all the properties that will be used in this project
    private int count ; // counter
    private String model;// variable to store the model of car
    private String make;// variable to store the make of car
    private String year;// variable to store the year of car
    private double cost;// variable to store the cost of car
    private double mileage;// variable to store the mileage of car
    // end of properties

    // Start of methods used in project
    // Constructors with no parameters
    public Car()
    {

    }
    //Constructor with the model of the car
    public Car(String model)
    {
        this.model = model;
    }
    //Constructor with all of the classes attributes
    public Car(String model, String make, String year, double cost, double mileage) {
        this.model = model;
        this.make = make;
        this.year = year;
        this.cost = cost;
        this.mileage = mileage;
    }

    // method to get the count of cars
    public int get_Count()
    {
        return count;
    }

    // method to set the model of the car
    public void setModel(String newModel){
        this.model = newModel;
    }

    // this method sets the car model
    public String getModel()
    {
        return model;
    }
    // method to set make of car
    public void setMake(String newMake){
        this.make = newMake;
    }

    // method to get the make of car
    public String getMake()
    {
        return make;
    }

    // method sets the year of the car
    public void setYear(String newYear) {
        this.year = newYear;

    }

    // method of to get the year of the car
    public String getYear(){
        return year;
    }

    // set the cost of the car
    public void setCost(double newCost){
        this.cost = newCost;
    }

    // this method gets the cost of the car
    public double getCost(){
        return cost;
    }

    // this method sets the mileage for the car
    public void setMileage(double newMileage){
        this.mileage = newMileage;
    }

    // this method gets the mileage of the car
    public double getMileage(){
        return mileage;
    }

    // this method gives you a easy way of listing all the objects attributes and labels them.
    public String toString(){
        return "Car Model: " +model+ "\n" + "Car Make: " + make+ "\n"
                + "Car Year: " + year+ "\n"+ "Car Cost: " + cost+ "\n" +"Car Mileage: " + cost;
    }

}// end class Car
