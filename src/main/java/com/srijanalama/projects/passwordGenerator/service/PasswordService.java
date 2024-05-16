package com.srijanalama.projects.passwordGenerator.service;

import com.srijanalama.projects.passwordGenerator.model.Password;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Random;

@Service
public class PasswordService implements  IPasswordService{
    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$";

    @Override
    public String generatePassword(Password password) {
        Random random = new Random();
        char[] generatedPassword = new char[password.getLength()];
        int i=0;

        while (i < password.getLength()){
            if(password.getIsLowerCase())
                generatedPassword[i++]  = LOWERCASE_CHARS.charAt(random.nextInt(LOWERCASE_CHARS.length()));
            if(password.getIsUpperCase())
                generatedPassword[i++]  = UPPERCASE_CHARS.charAt(random.nextInt(UPPERCASE_CHARS.length()));
            if(password.getIsNumber())
            generatedPassword[i++]  = NUMBERS.charAt(random.nextInt(NUMBERS.length()));
            if(password.getIsSymbol())
                generatedPassword[i++] = SPECIAL_CHARS.charAt(random.nextInt(SPECIAL_CHARS.length()));
        }

        return String.valueOf(generatedPassword);
    }
}
