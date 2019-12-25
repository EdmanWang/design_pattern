package com.wgx.desgin_pattern.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        int orderStartTime = 0;

        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9, 11, 15, 20);
        int index = list.size();
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer lineStartTime = list.get(i);
            if (lineStartTime > orderStartTime) {
                index = i;
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            result.addLast(list.get(i));
        }
        result.add(index, orderStartTime);
        System.out.println(result.toString());
    }
}
