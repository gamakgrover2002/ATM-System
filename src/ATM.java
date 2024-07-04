
import SystemManagement.TransactionManagement;
import UserManagement.UserManagement;

import java.util.HashMap;

public class ATM {

    HashMap<Integer,Integer> currency;

    int AtmId;
    TransactionManagement tm;
    UserManagement um;
    public ATM(HashMap<Integer,Integer> currency, int AtmId){

        this.AtmId = AtmId;
        tm = new TransactionManagement();
        um= new UserManagement();
        this.currency = currency;
    }


}
