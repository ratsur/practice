package com.ratsur.recursion;

import org.junit.jupiter.api.Test;

class SimpleRecursionTest {

    @Test
    void printDec() {
        SimpleRecursion dec = new SimpleRecursion();
        dec.printDec(5);
    }


    @Test
    void printInc() {
        SimpleRecursion sr = new SimpleRecursion();
        sr.printInc(5,1);
    }

    @Test
    void printInc1() {
        SimpleRecursion sr = new SimpleRecursion();
        sr.printInc(5);
    }

    @Test
    void printIncDec() {
        SimpleRecursion sr = new SimpleRecursion();
        sr.printIncDec(5);
    }

    @Test
    void fact() {
        SimpleRecursion sr = new SimpleRecursion();
        int n = sr.fact(5);
        System.out.println(n);
    }
}