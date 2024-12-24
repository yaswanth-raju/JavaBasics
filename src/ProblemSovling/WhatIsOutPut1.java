package ProblemSovling;

public class WhatIsOutPut1 {
    public static void main(String[] args) {
        boolean cond=true;
        int i =1;
        while (i<10){
            i++;
            if(i==5) {
                continue;
            }
            System.out.println(i);

        }
        System.out.println("out");
    }

}