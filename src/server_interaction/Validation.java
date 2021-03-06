/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server_interaction;

/**Validation class contains methods to validate user's input like username and etc.
 *
 * @author Bekezhan Abdykarimov
 * @author Liudmila Stolbetskaia
 */
public class Validation {
    
    public Validation(){
};

    public boolean isUsernameValid(String username) {
        boolean isValid = true;
        if (username == null) {
            isValid = false;
        }
        return isValid;
    }

    public boolean isValidPassword(String password) {
        boolean isValid = true;
        if (password.length() > 15 || password.length() < 6) {
            System.out.println("Password must be less than 20 and more than 6 characters in length.");
            isValid = false;
        }
        String upperCaseChars = "(.*[A-Z].*)";
        if (!password.matches(upperCaseChars)) {
            System.out.println("Password must have atleast one uppercase character");
            isValid = false;
        }
        String lowerCaseChars = "(.*[a-z].*)";
        if (!password.matches(lowerCaseChars)) {
            System.out.println("Password must have atleast one lowercase character");
            isValid = false;
        }
        return isValid;
    }

    public boolean isNameValid(String name) {
        boolean isValid = true;
        String letters = "[A-Z][a-z]*";
        String numbers = "[0-9]+";
        if (!name.matches(letters) || name.matches(numbers)) {
            System.out.println("Name shouldn't contain numbers");
            isValid = false;
        }
        return isValid;
    }

    public boolean isEmailValid(String email) {

        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        if (!email.matches(regex)) {
            System.out.println("email is not valid! try again");
        }
        return email.matches(regex);
    }

}
