package TrainTicketingSystem;
//********************************************************************
//Creating another subclass from the superclass 'Train' named 'Train2ndClass'
//********************************************************************
//-----------------------------------------------------------------
//Train class is considered to be polymorphic since this has multiple inheritance
//-----------------------------------------------------------------
public class Train2ndClass extends Train {
//-----------------------------------------------------------------
//Class attributes
//-----------------------------------------------------------------
    private static int numberOfSeats = 150;
    private static int WeightCapacity;
//-----------------------------------------------------------------
//It is made static because it is keep common among all and shared by all objects
//-----------------------------------------------------------------
//-----------------------------------------------------------------
//When we apply the reference variable facts to a Train object reference, the declarations are legal 
//-----------------------------------------------------------------
// Constructor: Sets up this Train1stClass using the specified information.
//-----------------------------------------------------------------
    public Train2ndClass(int trainIdNumber) {
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
//Returns the number of searss
//-----------------------------------------------------------------
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
//-----------------------------------------------------------------
//Sets the number of seats
//-----------------------------------------------------------------
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
//-----------------------------------------------------------------
//Returns the weight capacity of bagage
//-----------------------------------------------------------------
    public static int getWeightCapacity() {
        return WeightCapacity;
    }
//-----------------------------------------------------------------
//Sets the weight capacity of bagage
//-----------------------------------------------------------------
    public static void setWeightCapacity(int weightCapacity) {
        Train2ndClass.WeightCapacity = weightCapacity;
    }
}
