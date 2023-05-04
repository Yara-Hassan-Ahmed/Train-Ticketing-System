package TrainTicketingSystem;
import java.util.*;

public class BookingSystem {

   public static void book(User user, Trips trip, Ticket ticket) {
//-----------------------------------------------------------------
//Assigning the values of objects into another
//The paramateres of this function object from another function
//In this function we call out the user object credit balance and the ticket object fare so we can decrease the amount of fare from the user balance
//In this function we call out the trip object number of passengers so we can decrease the amount of passengers seats
//-----------------------------------------------------------------
        double tempBalance = user.getCreditBalance();
        double tempFare = ticket.getFare();
        user.setCreditBalance(tempBalance - tempFare);
        int tempNumberOfPassengers = trip.getNumberOfPassengers();
        trip.setNumberOfPassengers(tempNumberOfPassengers - 1);
    }
//-----------------------------------------------------------------
//In this function we call the classes to make a new object from it
//-----------------------------------------------------------------   
    public static void DisplayTicket(User user) {
//-----------------------------------------------------------------        
//Accessing member through reference variable to return all the information of the ticket
//-----------------------------------------------------------------
        Ticket tic =  user.getTic();
        Trips trip = tic.getTrip();
        int tranId = trip.getTrainIdNumber();
        String startCity = trip.getStartCity();
        String endCity = trip.getEndCity();
        double startTime = trip.getStartTime();
        double fare = tic.getFare();
//-----------------------------------------------------------------        
//Displaying ticket information
//-----------------------------------------------------------------
        System.out.println("The Id train is " + tranId);
        System.out.println("The start city is " + startCity);
        System.out.println("The end city is " + endCity);
        System.out.println("The start time is " + startTime);
        System.out.println("The trip fare is " + fare);
    }
}