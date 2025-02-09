package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
        System.out.println(isPerfectNumber(28));


    }

    public static boolean isPalindrome(int number) {
        int temp = number;
        int reverseNumber = 0;
        int lastNumber ;
        if (number < 0) {
            return false;
        }

        while (temp !=0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /=10;
        }
        if(number == reverseNumber){
            return true ;
        }

        else{
            return false;
        }
    }

    public static boolean isPerfectNumber(int number) {
        // Sayı 0'dan küçükse false döner
        if (number < 1) {
            return false;
        }

        int sum = 0;

        // Sayının bölenlerini bul ve toplamlarını hesapla
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number){
            return true;
        }else {
            return false;
        }
    }


    public static void numberToWords(int number) {

    }
}

