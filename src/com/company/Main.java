package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int [] numbers = new int[3];
//
//        numbers[0] = 10;
//        numbers[1] = 20;
//        numbers[2] = 30;
//
//        System.out.println(Arrays.toString(numbers));

    Array numbers = new Array(3);

    numbers.insert(10);
    numbers.insert(20);
    numbers.insert(30);
    numbers.insert(500);

    numbers.print();


    System.out.println("\nLargest number:");
    numbers.max();


    System.out.println("\nReversed: ");
    numbers.reverse();

    }
}
