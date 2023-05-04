package TrainTicketingSystem;
import java.util.Scanner;
//-----------------------------------------------------------------
//Trips is a superclass
//-----------------------------------------------------------------
public class Trips {
//-----------------------------------------------------------------
//The private instance variables
//-----------------------------------------------------------------
    static Trips trip;
    private String StartCity;
    private String EndCity;
    private double StartTime;
    private int NumberOfPassengers;
    private int trainIdNumber;
//-----------------------------------------------------------------    
//Creating a parameterized constructor 
//-----------------------------------------------------------------
    public Trips(String StartCity, String EndCity, double StartTime, int trainIdNumber) {
        this.StartCity = StartCity;
        this.EndCity = EndCity;
        this.StartTime = StartTime;
        this.trainIdNumber = trainIdNumber;

    }
//-----------------------------------------------------------------
//Default constructor
//-----------------------------------------------------------------
    public Trips() {}
//-----------------------------------------------------------------
//Public methods accessor & mutator for the private variables
//-----------------------------------------------------------------
//Returns Trips
//-----------------------------------------------------------------
    public static Trips getTrip() {
        return trip;
    }
//-----------------------------------------------------------------
//Sets the trip
//-----------------------------------------------------------------
    public static void setTrip(Trips trip) {
        Trips.trip = trip;
    }
//-----------------------------------------------------------------
//Returns the number of passengers
//-----------------------------------------------------------------
   public int getNumberOfPassengers() {
        return NumberOfPassengers;
    }
//-----------------------------------------------------------------
//Sets the number of seats
//-----------------------------------------------------------------
    public void setNumberOfPassengers(int NumberOfPassengers) {
        this.NumberOfPassengers = NumberOfPassengers;
    }
//-----------------------------------------------------------------
//Returns the started time
//-----------------------------------------------------------------
    public double getStartTime() {
        return StartTime;
    }
//-----------------------------------------------------------------
//Sets 
//-----------------------------------------------------------------
    public void setStartTime(double StartTime) {
        this.StartTime = StartTime;
    }
//-----------------------------------------------------------------
//Returns the start city
//-----------------------------------------------------------------
    public String getStartCity() {
        return StartCity;
    }
//-----------------------------------------------------------------
//Sets the start city
//-----------------------------------------------------------------
    public void setStartCity(String StartCity) {
        this.StartCity = StartCity;
    }
//-----------------------------------------------------------------
//Returns the end city 
//-----------------------------------------------------------------
    public String getEndCity() {
        return EndCity;
    }
//-----------------------------------------------------------------
//Sets the end city 
//-----------------------------------------------------------------
    public void setEndCity(String EndCity) {
        this.EndCity = EndCity;
    }
//-----------------------------------------------------------------
//Returns the Train Id number
//-----------------------------------------------------------------
    public int getTrainIdNumber() {
        return trainIdNumber;
    }

}
