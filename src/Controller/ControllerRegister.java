
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
public class ControllerRegister {
    RegisterForm frame; // declare variable gui registerform
    Registerable implRegister; // declare dao
    private int autoid; // buat database untuk increment primary key
    
    public ControllerRegister(RegisterForm frame) { // constructor registerform dan register interface
        this.frame = frame;
        this.implRegister = new Register(); // connect ke implement register
    }
    
    public int Regist() {
        String username, name, pass, conPass;
        int result = 0;
        username = frame.getjUsername().getText(); // get text username dari jtextfield yang ada di registerform
        name = frame.getjName().getText();
        pass = frame.getjPassword().getText();
        conPass = frame.getjConPassword().getText();
        if ((!frame.getjUsername().getText().isEmpty() & !frame.getjName().getText().isEmpty() & !frame.getjPassword().getText().isEmpty() & !frame.getjConPassword().getText().isEmpty()) && (!pass.equals(conPass))) {
            JOptionPane.showMessageDialog(null, "Password does not match!");
            result = 0;
        } else if (pass.equals("") || username.equals("") || username.equals("") || conPass.equals("")) {
            JOptionPane.showMessageDialog(null, "Login failed. Please fill all the blank forms.");
            result = 0;
        }
        if ((!frame.getjUsername().getText().isEmpty() & !frame.getjName().getText().isEmpty() & !frame.getjPassword().getText().isEmpty() & !frame.getjConPassword().getText().isEmpty()) && (pass.equals(conPass))) { // kondisi ideal
            User user = new User();
            implRegister.doRegister(autoid, username, name, pass);
            JOptionPane.showMessageDialog(null, "Create Account Successfully");
            result = 1;
        }
        return result;
    }
}
