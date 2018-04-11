package com.irast.algorithms.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecurePassword {

    static int minimumNumber(String password) {
        // Return the minimum number of characters to make the password strong
        boolean digit = false, upperCase = false, lowerCase = false,specialChar = false;
        int count = 0;
        for(char ch: password.toCharArray()) {
            if(!digit && (('9' - ch) >= 0 && ('9' - ch) <= 9)) digit = true;
            else if(!specialChar){
                Pattern p = Pattern.compile("^[!@#$%^&*()-+]");
                Matcher matcher = p.matcher(String.valueOf(ch));
                if(matcher.find()) specialChar = true;
            }
            else if(!upperCase && (!Character.isLowerCase(ch))) upperCase = true;
            else if(!lowerCase && (!Character.isLowerCase(ch))) lowerCase = true;
        }

        if(!digit) count++;
        if(!upperCase) count++;
        if(!lowerCase) count++;
        if(!specialChar) count++;
        while(password.length() + count < 6) count++;
        return count;

    }
}
