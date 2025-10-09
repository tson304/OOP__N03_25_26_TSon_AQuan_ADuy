package Username.hoc;



public class User implements People{
    private String fullName;
    private String dateOfBirth;
    Identity identity;
    private String userRole;

    public User(String fullName, String dateOfBirth, Identity identity, String userRole){
        this.dateOfBirth=dateOfBirth;
        this.fullName=fullName;
        this.identity=identity;
        this.userRole=userRole;
    }
    @Override
    public void setInfon(Identity identity){
        this.identity=identity;

    }
    @Override
    public String getInfo(Identity identity){
        if(this.identity!=null && this.identity.equals(identity)){
            return "Name: "+ fullName +",Date: "+dateOfBirth+",identity: "+identity+",Role: "+userRole;
         }else{
            return "sai roi!";
         }
        }
    public String getUserRole(){
        return userRole;
    }
    public void setUserRole(String userRole){
        this.userRole=userRole;
    }
    @Override
    public String toString(){
        return getInfo(identity);
    }
 


}