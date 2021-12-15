package com.company;

import java.util.Arrays;

public class Array {
    private int[] items;
    private int count;


    public Array(int length) {
        items = new int[length];
    }

    public void reverse() {
        int [] reverseArray = new int[count];
        int marker = count;

        for (int i = 0; i < count; i++) {
            reverseArray[marker - 1] = items[i];

            marker--;
        }

        System.out.println(Arrays.toString(reverseArray));
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];

            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            items = newItems;
        }

        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();


        for (int i = index; i < count; i++)
            items[i] = items[i + 1];

        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;

            return -1;
    }

    public void max() {
        int largestNumber = 0;

        for (int i = 0; i < count; i++) {
            if (items[i] > largestNumber)
                largestNumber = items[i];
        }

        System.out.println(largestNumber);
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

}
