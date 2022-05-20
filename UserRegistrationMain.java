package com.bl.UserRegistrationLambda;
/*
* @Author Atik
* User Registration validation using Lambda Function
* */
public class UserRegistrationMain {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validateFirstName();
        userRegistration.validateLastName();
        userRegistration.validateEmail();
        userRegistration.validatePhnNum();
        userRegistration.validatePassword();
    }
}
