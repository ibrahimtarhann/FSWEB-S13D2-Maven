package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        StringBuilder sb = new StringBuilder();
        sb.append(number);
        sb = sb.reverse();
        int reversedNumber = Integer.parseInt(sb.toString());
        return number == reversedNumber;
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            sum += number % i == 0 ? i : 0;
        }
        return sum == number;
    }

    public static String numberToWords(int number) {

        String temp = Integer.toString(number);
        StringBuilder returnString = new StringBuilder();

        for (int i = 0; i < temp.length(); i++) {
            returnString.append(numberToWord(temp.charAt(i))).append(" ");
        }
        return number >= 0 ? returnString.toString().trim() : "Invalid Value";
    }

    //Yardımcı method ->
    public static String numberToWord(char number) {
        return switch (number) {
            case '0' -> "Zero";
            case '1' -> "One";
            case '2' -> "Two";
            case '3' -> "Three";
            case '4' -> "Four";
            case '5' -> "Five";
            case '6' -> "Six";
            case '7' -> "Seven";
            case '8' -> "Eight";
            case '9' -> "Nine";
            default -> "";
        };
    }
}