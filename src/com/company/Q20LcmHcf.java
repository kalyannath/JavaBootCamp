package com.company;
//# 20. Write a program to find LCM of two positive numbers.

public class Q20LcmHcf {
    public static int HCF(int a, int b) {
        int hcf = 0;
        if (a == 0 || b == 0) {
            hcf = 1;
            return hcf;
        } else if (a > 0) {
            for (int i = a; i >= 1; i--) {
                if (a % i == 0 && b % i == 0) {
                    hcf = i;
                    break;
                }
            }
            return hcf;
        } else {
            for (int i = a; i <= -1; i++) {
                if (a % i == 0 && b % i == 0) {
                    hcf = Math.abs(i);
                    break;
                }
            }
            return hcf;
        }// end of the HCF method
    }
    public static int LCM(int c, int d) {
        int hcf = HCF(c, d);
        int lcm = 0;
        if (hcf != 0) {
            lcm = (c * d) / hcf;
        }
        return Math.abs(lcm);
    } // end of the LCM method

    public static void main(String[] args) {
        int hcf = HCF(-3, -4);
        int lcm = LCM(0, 1);
        System.out.println(hcf);
        System.out.println(lcm);
    } // end of the main method
} // end ot the LcmHcf class
/*
20. Write a program to find LCM of two positive numbers.
 */
