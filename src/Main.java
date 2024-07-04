import UserManagement.User;

import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   HashMap<Integer,Integer>  hm = new HashMap<>();
   hm.put(1,5);
   hm.put(10,10);
   hm.put(20,30);
   ATM atm = new ATM(hm,1);

//verifying user and addition of money
   User user1 = new User(1,1000,100000);
        user1.isVerified= atm.um.verifyUser(user1);
        atm.tm.addMoney(10000,user1);
        System.out.println();
      //withdrawal of money
      atm.tm.removeMoney(30000,user1);
        System.out.println();
//tranfering of money
        User user2 = new  User(2,10001,2000000);
        user2.isVerified = atm.um.verifyUser(user2);
        atm.tm.transferfunds(20000,user1,user2);
        System.out.println();
//check balance of user
        atm.tm.checkBalance(user1);
        atm.tm.checkBalance(user2);
    }
}