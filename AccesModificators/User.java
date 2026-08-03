package AccesModificators;

public class User {

    private String username;
    private String password;
    
    public User(String username, String password){
        this.username = username;
        this.password = password;

    }

    public void setUserName(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void checkPassword(String inputPassword){
        if(this.password == inputPassword){
            System.out.println("The password is correct");
        }else{
            System.out.println("The password is incorrect");
        }
    }
}
