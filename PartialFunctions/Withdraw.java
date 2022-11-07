public class Withdraw extends Transaction{
    public Withdraw(){

    }

    //withdraw money
    public static boolean withdraw(Account acc, double amt){
        if(acc.getBalance() < amt){
            System.out.println("No enough money in account " + acc.getAccNum());
            return false;
        }
        else if (amt < 0){
            System.out.println("Invalid amount entered");
            return false;
        }
        else{
            acc.setBalance(-amt);
            return true;
        }
        
    }
}