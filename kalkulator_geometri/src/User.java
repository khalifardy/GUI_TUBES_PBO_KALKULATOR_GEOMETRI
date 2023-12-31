import java.sql.*;
/**
 *
 * @author khalifardy
 */
public class User {
    private String username;
    private String password;
    private String name;
    private String email;

    // Constructor
    public User(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = "";
    }

    // Getter for nama
    public String getNama() {
        return name;
    }

    // Getter for nim
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }

    // Getter for prodi
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public void insert_user() throws SQLException{
        Database db = new Database();
        String sql = "insert into data_user (username, password, full_name, email) values ('"+this.getUsername()+"',"
                + "'"+this.getPassword()+"','"+this.getNama()+"','"+this.getEmail()+"')";
        db.query(sql);              
    }
}
