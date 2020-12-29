package com.nalazoocare.comparatort;

import java.util.Comparator;

/**
 * Created by nalazoo.yeomeme@gmail.com on 2020-03-30
 */
public class Ascending implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return a.compareTo(b);
    }
}
