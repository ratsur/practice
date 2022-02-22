package com.ratsur.challenges;

import java.util.HashMap;
import java.util.Map;

public class Gamer {
    public int solution(String S) {
        // write your code in Java SE 8
        Map<String, Integer> map = new HashMap<String, Integer>();
        return getCount(S, map);
    }

    private boolean checkQ(String S) {
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '?') return true;
        }
        return false;
    }

    private int getCount(String S, Map<String, Integer> memo) {
        if (memo.containsKey(S)) {
            System.out.println("Returning from memo");
            return memo.get(S);
        }
        if (!checkQ(S)) {
            System.out.println("String S = " + S);
            //System.out.print("S = "+S+" ");
            int l = Integer.MIN_VALUE, count = 1;
            char curr = S.charAt(0);
            for (int i = 1; i < S.length(); i++) {
                if (S.charAt(i) == curr) {
                    count++;
                } else {
                    if (count > l) {
                        l = count;
                    }
                    curr = S.charAt(i);
                    count = 1;
                }
            }
            if (count > l) l = count;
            return l;
        } else {
            int c = getCount(S.replaceFirst("\\?", "a"), memo);
            c = Math.min(getCount(S.replaceFirst("\\?", "b"), memo), c);
            memo.put(S, c);
            return c;

        }
    }

}