package com.nhnacademy.enviroment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

/**
 * @author : 이성준
 * @since : 1.0
 */


public class TestClass {

    @Test
    void name() {
        Integer[] a = new Integer[10];

        Stream<Integer> stream = Arrays.stream(a);

        stream.parallel();

        stream.toList();
    }
}
