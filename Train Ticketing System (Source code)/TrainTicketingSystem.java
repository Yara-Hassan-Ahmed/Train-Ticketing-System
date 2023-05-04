package TrainTicketingSystem;
import java.util.*;
public class TrainTicketingSystem {
//-----------------------------------------------------------------
//Array from class train
//-----------------------------------------------------------------
    public static Train[] trains = new Train[10];
    public static void main(String args[]) {
//-----------------------------------------------------------------
//Setting the amount of user credit balance
//-----------------------------------------------------------------
        User user = new User(1000);
//-----------------------------------------------------------------
//In this function the program scan the user input to make sure it is correct
//-----------------------------------------------------------------
        while (LoginSystem.login(user));
        Scanner s = new Scanner(System.in);
//-----------------------------------------------------------------
//Creating an array of objects trip
//-----------------------------------------------------------------
        Trips[] trip = new Trips[5];
//-----------------------------------------------------------------
//Creating objects trips that will be displayed as available trips
//-----------------------------------------------------------------
        trip[0] = new Trips("Alexandria", "Cairo", 14.00, 1987);
        trip[1] = new Trips("Alexandria", "Aswan", 15.15, 1969);
        trip[2] = new Trips("Alexandria", "Luxor", 16.30, 1996);
        trip[3] = new Trips("Alexandria", "Asyut", 17.45, 1963);
        trip[4] = new Trips("Alexandria", "Damanhur", 18.00, 1954);
//-----------------------------------------------------------------
//Polymorphism is the ability of an object to take on many forms
//Superclass 'Train' reference is used to refer to a subclasses objects 
//Any Java object that can pass more than one IS-A test is considered to be polymorphic
//Loop for the user to choose which class he wants to book
//-----------------------------------------------------------------
        for (int i = 0, j = 0; i < 10; i += 2, j++) {
            trains[i] = new Train1stClass(trip[j].getTrainIdNumber());
            trains[i + 1] = new Train2ndClass(trip[j].getTrainIdNumber());
        }
//-----------------------------------------------------------------
//The statements inside loop execute and then the condition gets evaluated
//If the condition returns true then the control gets transferred to the “do” else it jumps to the next statement after do-while
//-----------------------------------------------------------------
        int choice;
        do { 
//-----------------------------------------------------------------
//Body of loop
//-----------------------------------------------------------------
//Main menu of the program
//-----------------------------------------------------------------
            print("\n******************Booking Train Ticket*****************\n");
            print("1) Display available trips");
            print("2) Book a trip");
            print("3) Print Ticket");
            print("4) Exit");
            print("\nPlease select an option: ");
            choice = s.nextInt();
//-----------------------------------------------------------------
//Switch case statement is used when we have number of choices and we may need to perform a different task for each choice
//In this switch case we are allowing the user to choose between different main menu options
//-----------------------------------------------------------------
            switch (choice) {
                case 1:
//-----------------------------------------------------------------
//For loop to print all the available trips for the user with the all its information
//-----------------------------------------------------------------
                    print("******************Trips available******************\n");
                    for (int i = 0; i < 5; i++) {
                        print("******************Trip " + (i + 1) + "******************" + "\n");
                        print("Start City :" + trip[i].getStartCity() + "\n"
                                + "End City : " + trip[i].getEndCity() + "\n"
                                + "Start Timing :" + trip[i].getStartTime() + "\n"
                                + "Train Id Number: " + trip[i].getTrainIdNumber() + "\n");
                    }
                    break;
//-----------------------------------------------------------------
//When a break statement is encountered inside a loop
//The loop is immediately terminated and the program control resumes at the next statement following the loop
//-----------------------------------------------------------------                                      
                case 2:
//-----------------------------------------------------------------
//In this switch case we are allowing the user to choose his trip number and his class number
//----------------------------------------------------------------- 
//Print statment to scan the user input for the trip number and class number
//-----------------------------------------------------------------                     
                    print("Enter the number of trip: ");
                    int num = s.nextInt();
                    print("Enter the type of class ex('1'1st class, '2'2nd class): ");
                    int numclass = s.nextInt();
//-----------------------------------------------------------------                    
//Null is the default value of any reference variable 'tic' 
//And we cannot call any instance method or access an instance variable using null reference in Java
//-----------------------------------------------------------------                    
                    Ticket tic = null;
//-----------------------------------------------------------------
//In this switch case we are allowing the user to choose between 1st or 2nd class to display the ticket fare
//-----------------------------------------------------------------                    
                    switch (num) {
//-----------------------------------------------------------------
//In this switch case after we scanned the user input of the trip and class he choose
//Creating a new object with the user input as we can see what he choose and by that will be his fare for the trip
//Example: If he choose numclass 1 then we will display the ticket 1st class fare 
//If not then we will display the ticket 2nd class fare 
//-----------------------------------------------------------------                        
                        case 1:
                            tic = new Ticket(((numclass == 1) ? 250 : 150), trip[num - 1]);
                            break;
                        case 2:
                            tic = new Ticket(((numclass == 1) ? 350 : 250), trip[num - 1]);
                            break;
                        case 3:
                            tic = new Ticket(((numclass == 1) ? 450 : 350), trip[num - 1]);
                            break;
                        case 4:
                            tic = new Ticket(((numclass == 1) ? 150 : 100), trip[num - 1]);
                            break;
                        case 5:
                            tic = new Ticket(((numclass == 1) ? 70 : 50), trip[num - 1]);
                            break;
                    }
                    BookingSystem.book(user, trip[num - 1], tic);
                    user.setTic(tic);
//-----------------------------------------------------------------                    
//In this function when the user enter the number of trip and class this function will decrease the number of seats
//-----------------------------------------------------------------                    
                    int temp = (num - 1) * 2 + (numclass - 1);
                    if (temp % 2 == 0) {
//-----------------------------------------------------------------                        
//If the output is an even number then it will decrease 1st class number of seats
//-----------------------------------------------------------------
                        ((Train1stClass) trains[temp]).setNumberOfSeats((((Train1stClass) trains[temp]).getNumberOfSeats()) - 1);
                    } else {
//-----------------------------------------------------------------
//If the output is an odd number then it will decrease 2st class number of seats
//-----------------------------------------------------------------
                        ((Train2ndClass) trains[temp]).setNumberOfSeats((((Train2ndClass) trains[temp]).getNumberOfSeats()) - 1);
                    }
                    break;
//-----------------------------------------------------------------
//In this switch case the user will print out his ticket where all the information will be displayed for them
//-----------------------------------------------------------------                   
                case 3:
                    print("******************Your Train Ticket******************\n");
                    BookingSystem.DisplayTicket(user);
                    break;
//-----------------------------------------------------------------
//The last switch case is the execution of the program                     
//-----------------------------------------------------------------                    
                case 4:
                    print("Thank you for choosing 'Train Ticketing System' ! "
                            + " Have a safe trip!\n");
                    System.exit(0);
                    break;
            }
//-----------------------------------------------------------------            
//The Java break statement is used to break switch statement
//It breaks the current flow of the program at specified condition   
//-----------------------------------------------------------------  
        }
//-----------------------------------------------------------------
//The Java do-while loop is executed at least once because condition is checked after loop body
//In the while condition when it reaches the last number of cases it will exist the program      
//-----------------------------------------------------------------        
        while (choice != 4);
    }
//-----------------------------------------------------------------    
//Overloading
//-----------------------------------------------------------------    
    public static void print(String s) {
        System.out.println(s);
    }
    public static void print(int i) {
        System.out.println(i);
    }
}
