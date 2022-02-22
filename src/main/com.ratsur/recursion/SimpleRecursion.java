package com.ratsur.recursion;

public class SimpleRecursion {

    public void printDec(int n)
    {
        if(n==0) return;
        System.out.println(n);
        printDec(n-1);
    }

    public void printInc(int n)
    {
        if(n==0) return;
        printInc(n-1);
        System.out.println(n);
    }

    public void printInc(int n, int start)
    {
        if(start>n) return;
        System.out.println(start);
        printInc(n,start+1);
    }

    public void printIncDec(int n)
    {
        if(n==0) return;
        System.out.println(n);
        printIncDec(n-1);
        System.out.println(n);
    }

    public int fact(int n)
    {
        if(n==0||n==1) return 1;
        int ans = n*fact(n-1);
         return ans;
    }

}
