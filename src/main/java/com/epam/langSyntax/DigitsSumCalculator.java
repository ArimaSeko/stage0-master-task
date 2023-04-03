package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int t=0;
     char[] ch = Integer.toString(number).toCharArray();

        for(int i =0; i<ch.length;i++) t = t + Integer.parseInt(String.valueOf(ch[i]));

        System.out.println(t);
    }
}
