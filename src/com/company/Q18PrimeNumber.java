package com.company;
// # 18. Write a program to print 1st five prime numbers.
//
//# expected output: 2, 3, 5, 7, 11

public class Q18PrimeNumber {
    public static boolean isPrimeNumber(int a) {
        int divisorCount = 0;
        if (a == 0) {
//            System.out.printf("%d is neither prime nor composite\n", a);
            return false;
        } else {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    divisorCount++;
                }
            }
            if (divisorCount <= 2) {
//                System.out.printf("%d is prime number\n", a);
                return true;
            } else {
//                System.out.printf("%d is composite number\n", a);
                return false;
            }
        }
    } // end of the isPrimeNumber method

    public static void primeNumbers(int primeCount) {
        int count = 1;
        int n = 2;
        while (count <= primeCount) {
            boolean isPrime = isPrimeNumber(n);
            if (isPrime) {
                System.out.printf("%d is prime\n", n);
                count++;
            }
            n++;
        }
    } // end of the primeNumbers method

    public static void main(String[] args) {
//        isPrimeNumber(1);
//        isPrimeNumber(9);
//        isPrimeNumber(0);
//        isPrimeNumber(4);
//        isPrimeNumber(-2);
//        isPrimeNumber(-1);
        primeNumbers(5);   // prints first 5 prime number
    } // end of the main method
} // end of the PrimeNumber class