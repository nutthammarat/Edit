/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Choppy
 */
import java.util.*;
import javax.swing.JOptionPane;

public class LoginService {

    public static boolean checkUsername(User user) {
        User thisUser = null;
        thisUser = UserService.getUser(user.getUsername());
        if (thisUser == null) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkPassword(User user) {
        User thisUser = null;
        thisUser = UserService.getUser(user.getUsername());
        if (thisUser.getPassword().equals(user.getPassword())) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean goToMain(User user) {

        if (checkUsername(user) && checkPassword(user)) {
            return true;
        } else {
            return false;
        }
    }

    public static void goTORegister() {
        RegisterForm register = new RegisterForm();
        register.setVisible(true);
    }
}
