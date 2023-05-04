package TrainTicketingSystem;
//********************************************************************
//Creating a subclass from the superclass 'Train' named 'Train1stClass'
//********************************************************************
//-----------------------------------------------------------------
//Train class is considered to be polymorphic since this has multiple inheritance
//-----------------------------------------------------------------
public class Train1stClass extends Train {
//-----------------------------------------------------------------
//Class attributes
//----------------------------------------------------------------
    private static int numberOfSeats = 100;
//-----------------------------------------------------------------
//It is made static because it is keep common among all and shared by all objects
//-----------------------------------------------------------------
    String[] dinnerList = new String[2];
//-----------------------------------------------------------------
//When we apply the reference variable facts to a Train object reference, the declarations are legal 
//-----------------------------------------------------------------
// Constructor: Sets up this Train1stClass using the specified information.
//-----------------------------------------------------------------
    public Train1stClass(int trainIdNumber) {
        super(trainIdNumber);
    }
//-----------------------------------------------------------------
//defining the same method as in the superclass 'Train'  
//-----------------------------------------------------------------
//Override the getTrainNumber() method inherited from superclass Train
//-----------------------------------------------------------------
    @Override
    public int getTrainNumber() {
        return super.getTrainNumber();
    }
//-----------------------------------------------------------------
//Public methods accessor & mutator for the private variables
//-----------------------------------------------------------------
//@Override this annotation can not be used because it will give error because it is not an override method
//-----------------------------------------------------------------
//Returns the number of seats
//-----------------------------------------------------------------
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
//-----------------------------------------------------------------
//Sets number of seats
//-----------------------------------------------------------------
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
//-----------------------------------------------------------------    
//garbage collector
//-----------------------------------------------------------------    
    public void setdinnerList(String[] list) {
//-----------------------------------------------------------------
// Nullifying the reference variable 
//-----------------------------------------------------------------
        dinnerList = null;
//-----------------------------------------------------------------
// requesting JVM for running Garbage Collector
//-----------------------------------------------------------------
        dinnerList = list;
        System.gc();
        Runtime.getRuntime().gc();
    }

}
