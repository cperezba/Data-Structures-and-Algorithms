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

    numbers.insert(1);
    numbers.insert(50);
    numbers.insert(2);

    numbers.print();

    }
}
