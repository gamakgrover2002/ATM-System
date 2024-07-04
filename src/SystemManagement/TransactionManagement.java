package SystemManagement;

import UserManagement.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class TransactionManagement {

    private HashMap<Integer, Integer> hashmap;

    public TransactionManagement(){

   }
   public void addMoney(  int amount, User user){
        if(user.isVerified){

       user.balance += amount;
       System.out.println("Money added");
        System.out.println("Your balance: "+ user.balance);
        }
        else{
            System.out.println("You cant make the following Transaction");
        }

   }
   public void removeMoney(int amount,User user){
        if(user.isVerified){
            user.balance -= amount;
System.out.println("Money Withdrawn");
            System.out.println("Your balance: "+ user.balance);}
        else{
            System.out.println("You cant make the following Transaction");
        }

   }
   public void transferfunds(int amount,User u1,User u2){
        u1.balance -= amount;
        u2.balance+= amount;
        System.out.println("Transfer complete");
   }
 public void checkBalance(User user){
        System.out.println(user.userId+": Your balance is "+user.balance);
 }




}
