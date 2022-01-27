/*
You are given a string S of length N consisting of characters 'a' and 'b' with additional empty gaps represented by '?'.
Your task is to replace every such gap with either an 'a' character or a 'b' character so
that the longest fragment of S, consisting only of 'a' characters or 'b' characters, is as short as possible.

For example, for S = "aa??bbb", if you replace "??" with "aa",
the longest fragment consisting of equal characters will have length 4: "aaaabbb".
You can obtain a better result by replacing "??" with "ba", resulting in "aababbb".
Then the longest fragment consisting of equal characters will have length 3.

Write a function:

class Solution { public int solution(String S); }

that, given a string S of length N,
returns the minimum possible length of the longest fragment of S consisting of equal characters after replacing all "?" characters with letters.

Examples:

1. Given S = "aa??bbb", your function should return 3, as explained above.

2. Given S = "a?b?aa?b?a", your function should return 2. Question marks can be replaced in the following way: "aabbaabbaa".

3. Given S = "??b??", your function should return 1.

4. Given S = "aa?b?aa", your function should return 3.

Write an efficient algorithm for the following assumptions:

string S consists only of the following characters: "a", "b" and/or "?";
N is an integer within the range [1..100,000].

*/


// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
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