package com.ratsur.leetcode;

import java.util.*;

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        return solve(x, x);
    }

    public boolean solve(int x, int orginalX) {
        System.out.println("x=" + x);
        if (x < 0) return false;
        if (x == 0) return true;
        if (x % 10 == 0) return false;
        int pal = 0;
        int len = 0;
        List<Integer> list = new ArrayList<Integer>();
        while (x > 0) {
            len++;
            list.add(x % 10);
            x = x / 10;
        }
        System.out.println("list = " + list);
        for (int i = list.size() - 1, j = 0; i >= 0; i--, j++) {
            int pow = (int) Math.pow(10, i);
            //pal = pal + (list.get(i-1) * (10^i));
            pal = pal + (pow * list.get(j));

        }
        System.out.println("pal = " + pal);
        return (pal == orginalX);
    }
}


