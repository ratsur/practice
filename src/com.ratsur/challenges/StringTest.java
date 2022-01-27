package com.ratsur.challenges;

public class StringTest {
    public static void main(String[] args) {
        String s = "asd     adsfasd     s";
        String [] ops = s.split("\\s");
        for(String op:ops)
        {
            if(!op.isEmpty())
            System.out.println(op);
        }

    }
}
