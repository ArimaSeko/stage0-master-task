package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        cathetusLength = cathetusLength+1;
        for (int i = 1; i < cathetusLength; i++) {
            for(int q = cathetusLength-i-1;q>0;q--){
                System.out.print(" ");
            }
            for (int k = i; k > 1; k--) {
                System.out.print(k);
            }
            for (int j = 1;j<i+1;j++) System.out.print(j);
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
