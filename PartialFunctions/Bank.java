import java.util.ArrayList;
import java.util.HashMap;

public class Bank {
    //HashMap allows one user only maps to one list of account
    private static HashMap<User, ArrayList<Account>> map;

    //constructor
    public Bank(){
        map = new HashMap<>();
    }

    //Add newly registered user to the bank info
    public void addUser(User user, ArrayList<Account> acc){
        map.put(user, acc);
    }

    public HashMap getMap() { return map; }
}
