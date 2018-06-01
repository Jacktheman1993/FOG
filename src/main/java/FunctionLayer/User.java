package FunctionLayer;


public class User {

    public User( String Email, String Password, String Role ) {
        this.Email = Email;
        this.Password = Password;
        this.Role = Role;
    }

    private int id; // just used to demo retrieval of autogen keys in UserMapper
    private String Email;
    private String Password; // Should be hashed and all
    private String Role;

    public User(int id, String Email, String Password, String Role) {
        this.id = id;
        this.Email = Email;
        this.Password = Password;
        this.Role = Role;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail( String Email ) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword( String Password ) {
        this.Password = Password;
    }

    public String getRole() {
        return Role;
    }

    public void setRole( String Role ) {
        this.Role = Role;
    }

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", Email=" + Email + ", Password=" + Password + ", Role=" + Role + '}';
    }
    

}
