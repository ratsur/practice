package com.ratsur.stackOverflow;

import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input an integer : ");
        int num=input.nextInt();
        int y=0;
        if(num>100){
            y=200;
        }
        if(num<100){
            y=200;
        }
        if(num==100){
            y=200;
        }
        System.out.println(y);
    }
}
