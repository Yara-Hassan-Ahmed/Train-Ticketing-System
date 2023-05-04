package TrainTicketingSystem;

public class User {
//-----------------------------------------------------------------    
//The private instance variables
//-----------------------------------------------------------------
    private String username;
    private String password;
    private double creditBalance;
    private Ticket tic;
//-----------------------------------------------------------------    
//Default constructor    
//-----------------------------------------------------------------    
    public User(double creditBalance) {
        this.username = "Admin";
        this.password = "Admin";
        this.creditBalance = creditBalance;
    }
//-----------------------------------------------------------------
//Public methods accessor & mutator for the private variables
//-----------------------------------------------------------------
//Returns the username of this user
//-----------------------------------------------------------------
    public String getUsername() {
        return username;
    }
//-----------------------------------------------------------------
//Sets the username
//-----------------------------------------------------------------
    public void setUsername(String username) {
        this.username = username;
    }
//-----------------------------------------------------------------
//Returns the password of this user
//-----------------------------------------------------------------    
    public String getPassword() {
        return password;
    }
//-----------------------------------------------------------------
//Sets the password
//-----------------------------------------------------------------
    public void setPassword(String password) {
        this.password = password;
    }
//-----------------------------------------------------------------
//Returns the credit balance of this user
//-----------------------------------------------------------------
    public double getCreditBalance() {
        return creditBalance;
    }
//-----------------------------------------------------------------
//Sets the credit balance
//-----------------------------------------------------------------    
    public void setCreditBalance(double creditBalance) {
        this.creditBalance = creditBalance;
    }
//-----------------------------------------------------------------
//Sets the ticket
//-----------------------------------------------------------------
    public void setTic(Ticket tic) {
        this.tic = tic;
    }
//-----------------------------------------------------------------
//Returns the ticket instance of this user    
//-----------------------------------------------------------------
    public Ticket getTic() {
        return tic;
    }
}
