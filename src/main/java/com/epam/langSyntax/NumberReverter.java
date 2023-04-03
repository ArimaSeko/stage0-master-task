package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        String reverse = Integer.toString(number);
        for(int i = reverse.length()-1;i>=0;i--){
            System.out.print(reverse.charAt(i));
        }
    }

}
