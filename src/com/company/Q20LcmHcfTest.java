package com.company;

import static org.junit.jupiter.api.Assertions.*;

class Q20LcmHcfTest {

    @org.junit.jupiter.api.Test
    void HCF() {
        int hcf1 = Q20LcmHcf.HCF(0, 0);
        assertEquals(1, hcf1);
        int hcf2 = Q20LcmHcf.HCF(1, 0);
        assertEquals(1, hcf2);
        int hcf3 = Q20LcmHcf.HCF(0, 1);
        assertEquals(1,hcf3);
        int hcf4 = Q20LcmHcf.HCF(3, 4);
        assertEquals(1, hcf4);
        int hcf5 = Q20LcmHcf.HCF(-3, -4);
        assertEquals(1, hcf5);
        int hcf6 = Q20LcmHcf.HCF(-3, 4);
        assertEquals(1, hcf6);
        int hcf7 = Q20LcmHcf.HCF(3, -4);
        assertEquals(1, hcf7);
        int hcf8 = Q20LcmHcf.HCF(26, 13);
        assertEquals(13, hcf8);
        int hcf9 = Q20LcmHcf.HCF(41, 51);
        assertEquals(1, hcf9);
        int hcf10 = Q20LcmHcf.HCF(8, -12);
        assertEquals(4, hcf10);
    }

    @org.junit.jupiter.api.Test
    void LCM() {
        int lcm1 = Q20LcmHcf.LCM(0, 0);
        assertEquals(0, lcm1);
        int lcm2 = Q20LcmHcf.LCM(1, 0);
        assertEquals(0, lcm2);
        int lcm3 = Q20LcmHcf.LCM(0, 1);
        assertEquals(0, lcm3);
        int lcm4 = Q20LcmHcf.LCM(3, 4);
        assertEquals(12, lcm4);
        int lcm5 = Q20LcmHcf.LCM(-3, -4);
        assertEquals(12, lcm5);
        int lcm6 = Q20LcmHcf.LCM(-3, 4);
        assertEquals(12, lcm6);
        int lcm7 = Q20LcmHcf.LCM(3, -4);
        assertEquals(12, lcm7);
        int lcm8 = Q20LcmHcf.LCM(26, 13);
        assertEquals(26, lcm8);
        int lcm9 = Q20LcmHcf.LCM(41, 51);
        assertEquals(2091, lcm9);
        int lcm10 = Q20LcmHcf.LCM(8, -12);
        assertEquals(24, lcm10);

    }
}