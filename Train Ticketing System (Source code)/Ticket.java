package TrainTicketingSystem;
import java.util.Scanner;
//-----------------------------------------------------------------
//A subclass inherits all the variables and methods of the superclass
//In addition, it extends the superclass by providing more variables and methods
//Class that implements the interface   
//Class ticket is inherited from class trips
//We derive a subclass called Ticket from the superclass Trips
//-----------------------------------------------------------------
public class Ticket extends Trips implements IdNumber {
//-----------------------------------------------------------------
//The private instance variables
//-----------------------------------------------------------------
    private double fare;
    private String id;
//-----------------------------------------------------------------    
//Creating a parameterized constructor 
//-----------------------------------------------------------------
    public Ticket(double fare, Trips trip) {
        this.fare = fare;
        this.trip = trip;
    }
//-----------------------------------------------------------------
//Public methods accessor & mutator for the private variables
//-----------------------------------------------------------------
//Returns the value of fare for this ticket
//-----------------------------------------------------------------
    public double getFare() {
        return fare;
    }
//-----------------------------------------------------------------
//Sets the ticket fare
//-----------------------------------------------------------------
    public void setFare(double fare) {
        this.fare = fare;
    }
//-----------------------------------------------------------------
//Sets the Id of ticket
//-----------------------------------------------------------------
    public void setId(String id) {
        this.id = id;
    }
//-----------------------------------------------------------------
//Returns the Id of this ticket
//-----------------------------------------------------------------
    public String getId() {
        return id;
    }

}
