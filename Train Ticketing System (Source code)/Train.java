package TrainTicketingSystem;
//********************************************************************
//Creating a superclass name 'Train'
//********************************************************************
public class Train {
//-----------------------------------------------------------------
//class attributes
//-----------------------------------------------------------------
    int trainIdNumber;
 //creating a parameterized constructor  
//-----------------------------------------------------------------
// Constructor: Sets up this Train using the specified information
//-----------------------------------------------------------------
    public Train(int trainIdNumber) {
        this.trainIdNumber = trainIdNumber;
    }
//-----------------------------------------------------------------
// Returns a string including the train Id number.
//-----------------------------------------------------------------
//Returns a self-descriptive String
//-----------------------------------------------------------------
    @Override
    public String toString() {
        return "Train{" + "trainIdNumber=" + trainIdNumber + '}';
    }
//-----------------------------------------------------------------
//Public methods accessor & mutator for the private variables
//-----------------------------------------------------------------
//Returns the tarin Id number
//-----------------------------------------------------------------
    public int getTrainNumber() {
        return trainIdNumber;
    }
//-----------------------------------------------------------------
//Sets the tarin Id number
//-----------------------------------------------------------------
    public void setTrainIdNumber(int trainIdNumber) {
        this.trainIdNumber = trainIdNumber;
    }

}
