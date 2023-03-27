/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import VIEW.*;
import Implement.*;
import MODEL.User;
import javax.swing.JOptionPane;

/**
 *
 * @author shintadl
 */
public class ControllerLogin {
    
    LoginForm frame;
    Loginable implLogin;
    
    public ControllerLogin(LoginForm frame) {
        this.frame = frame;
        this.implLogin = new Login(); 
    }
    
    public int LogIn() {
        int resultAuth = 0;
        int result = 0;
        if (!frame.getTfUsername().getText().isEmpty() & !frame.getjPasswordField().getText().isEmpty()) {
            User user = new User();
            String username = frame.getTfUsername().getText();
            String password = frame.getjPasswordField().getText();
            resultAuth = implLogin.auth(username, password);
            if (resultAuth == 1) {
                result = resultAuth;
            } else {
                result = 0;
            }
            if (result == 1) {
                JOptionPane.showMessageDialog(null, "Successfully Logged in");
                
            } else if (result == 0) {
                JOptionPane.showMessageDialog(null, "Login failed: Cannot find your account.");
            }
            
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Login failed. Username and password can not be empty.");
        }
        return result;
        
    }
    
}
