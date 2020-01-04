package com.java.v8;

import java.util.function.BiFunction;

public class _03_MethodReferences {

	static int add(int x, int y){
        return x + y;
    }

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = _03_MethodReferences::add;

        Integer sum = adder.apply(1, 2);
        System.out.println(sum);
    }

}
