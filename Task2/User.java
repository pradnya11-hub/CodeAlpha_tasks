import java.util.HashMap;

public class User {
    String name;
    Double balance;
    HashMap<String,Integer> portfolio= new HashMap<>();
    User(String name,double balance){
        this.name=name;
        this.balance=balance;
    }
}
