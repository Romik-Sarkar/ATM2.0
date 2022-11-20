import java.util.Scanner;

public class login {
    //Login Page
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String username, password, choice;
        Bank b = new Bank(); 

        //allow login until user leave
        do{
            //Prompt
            System.out.println("Enter username:");
            username = in.nextLine();
            System.out.println("Enter your password: ");
            password = in.nextLine();
    
            //Database haven't done
            //Treat only valid as match in database
            if(!username.equals("") && !password.equals("")){
                if(username.equals("valid")){ //user exist
                    //Go to homepage
                    User user = new User(username, password, b);
                    user.service();
                }
                else{
                    //Create User
                    Register r = new Register(username, password);
                    r.register();
                }
            }
            else{
                //Display error message when invalid input
                System.out.println("Invalid input, please try again");
                System.out.println("Do you want to leave? reply 'y' or 'n'");
                choice = in.next();
                if(!choice.equals("y"))
                    continue;
                else
                    break;
            }
            
            System.out.println("You have logout");
            System.out.println("Do you want to leave? reply 'y' or 'n'");
            choice = in.next();
            in.nextLine(); //clear buffer
        }while(!choice.equals("y"));
        System.out.println("Have a good day!");

        //in.close();
    }


}
