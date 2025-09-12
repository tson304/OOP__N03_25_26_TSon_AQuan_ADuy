package Username.src;

import java.util.ArrayList;
import java.util.List;

public class ListOfUser {
    private List<User> users;
    public ListOfUser() {
        users = new ArrayList<>();
    }
    public void addUser(User user){
        users.add(user);
    }
    public List<User> getAllUser(){
        return users;
    }
    public User findForIdentity(Identity identity){
        for(User u : users){
            if(u.getInfo(identity).contains(identity.toString())){
                return u;

            }
        }
        return null;
    }
    public boolean deleteUser(Identity identity){
        User user =findForIdentity(identity);
        if(user ==null){
            users.remove(user);
            return true;
        } else return false;

    }
    public void printUser(){
        for(User u :users){
            System.out.println(u.getInfo(u.identity));
        }
    }
}
