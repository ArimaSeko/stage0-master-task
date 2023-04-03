package com.epam.loops;
public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
    cathetusLength=cathetusLength;
    for (int i = 0;i<cathetusLength;i++){
        for (int k = cathetusLength-i;k>1;k--){
            System.out.print(" ");
        }
    for (int j = i+1;j>0;j--){
        System.out.print("*");
    }
        System.out.print("\n");
    }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
