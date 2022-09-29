/* Occupation.java
* This file contains the Occupation Class for Occupation Project. 
* Occupation class can modify the attributes of Occupation. 
* last edited November July 19 by A. Emmanuel
* course CSCI 112 
*/



package Occupation.src.occupation;

public class Occupation {
    // All of the data members in class
    private String occ;
    private String title;
    private double employed;
    private double hourly;
    private double annual;
    // end of all the properties in the class. 

    // Start of the methods in this class.
    // Constructor method with out parameters. 
    public Occupation(){

    }

    // Constructor with occupation parameter.
    public Occupation(String occ){
        this.occ = occ;
    }

    // Constructor with all properties.
    public Occupation(String occ, String title, double employed, double hourly, double annual){
        this.occ = occ;
        this.title = title;
        this.employed = employed;
        this.hourly = hourly;
        this.annual = annual;
    }

    // all setMethods for class.
    // set the occupation code. 
    public void setOcc(String oCode){
        this.occ = oCode;
    }

    // set the title for occupation.
    public void setTitle(String jobTitle){
        this.title = jobTitle;
    }

    // set how many employees are hired for occupation. 
    public void setEmployed(double employedAmount){
        this.employed = employedAmount;
    }

    // set the hourly rate.
    public void setHourly(double hourlyRate){
        this.hourly = hourlyRate;
    }

    // set the annual rate.
    public void setAnnual(double annualSalary){
        this.annual = annualSalary;
    }
    // End of the setting methods.

    // start of the get methods. 
    // get the occupation value.
    public String getOcc(){
        return occ;
    } 
    
    // get how many employees have been hired.  
    public double getEmployed(){
        return employed;
    }

    // get the hourly rate for occupation.
    public double getHourly(){
        return hourly; 
    }

    // get the annual amount for occupation.
    public double getAnnual(){
        return annual;
    }

    // Lists all of the object attributes and labels them accordingly.
    public String toString(){
        return "Occupation: " +occ + ","+ "" + " Title: " + title + "," +"" + 
        " Employed: " + employed + ","+ "" + " Hourly: " + hourly +"," + "" + " Annual: " + annual + "\n\n";
    }
}


