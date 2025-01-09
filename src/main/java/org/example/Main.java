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
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reversedNumber = reverse(number);
        int originalDigitCount = getDigitCount(number);

        while (reversedNumber > 0) {
            int lastDigit = reversedNumber % 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reversedNumber /= 10;
        }

        int reversedDigitCount = getDigitCount(reverse(number));
        for (int i = 0; i < originalDigitCount - reversedDigitCount; i++) {
            System.out.println("Zero");
        }
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reversed = (reversed * 10) + lastDigit;
            number /= 10;
        }
        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }



}

