package UserManagement;

public class UserManagement {
    public UserManagement(){

    }
    public boolean verifyUser(Object obj){
        if(obj instanceof User){
            System.out.println(((User) obj).userId + " user You are verified");
            return true;
        }
        else{
            System.out.println("You are not verified");
            return false;
        }}


}
