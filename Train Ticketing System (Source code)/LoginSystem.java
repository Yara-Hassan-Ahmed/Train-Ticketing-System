package TrainTicketingSystem;
import java.util.Scanner;

public class LoginSystem {
//-----------------------------------------------------------------    
//In this function we have a default username and password to decrease the error logging in the system
//-----------------------------------------------------------------    
    public static boolean login(User user) {
//-----------------------------------------------------------------
//By scanning the user input we will see it's correct or not to log in
//-----------------------------------------------------------------
        Scanner br = new Scanner(System.in);
        String username;
        String password;
        boolean flag = false;
        while (flag != true) {
            System.out.print("Enter Username: ");
            username = br.nextLine();
            System.out.print("Enter password: ");
            password = br.nextLine();
//-----------------------------------------------------------------
//If the user enters them wrong the program will make the user re enter the right ones until they get it
//-----------------------------------------------------------------
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                System.out.println("\nLogin successfully !");
                flag = true;
            }
        }
        return !flag;
    }
}
