/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author shintadl
 */
public class User {
    private int autoid;
    private String username;
    private String name;
    private String password;
    
    private int getautoId() {
        return autoid;
    }
    
    private void setautoId(int autoid) {
        this.autoid = autoid;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPass() {
        return password;
    }
    
    public void setPass(String password) {
        this.password = password;
    }
}
