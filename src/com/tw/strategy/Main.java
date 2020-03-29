package com.tw.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //int[] a ={2,3,9,5,7,12};
        Cat[] c = {new Cat(6,1),new Cat(3,4),new Cat(2,2)};
        Sorter<Cat> sorter = new Sorter<>();
        sorter.sort(c,new CatHeightComparator());
        System.out.println(Arrays.toString(c));
    }
}
