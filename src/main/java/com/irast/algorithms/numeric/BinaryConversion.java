package com.irast.algorithms.numeric;

public class BinaryConversion {

    public String convertToBinary(int number) {

        StringBuilder sb = new StringBuilder();
        while (number != 0) {
            sb.append(number % 2);
            number = number / 2;
        }
        //sb.append(number);
        return sb.reverse().toString();
    }

    // number must be greater than 0
    public String convertToBinaryRecursively(int number) {
        if (number == 0) return "";
        return convertToBinaryRecursively(number / 2) + number % 2;
    }
}
