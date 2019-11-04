package com.example.mqdemo.mqdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MqdemoApplicationTests {

    @Test
    public void contextLoads() {
        List<Object> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<Integer>();
        Integer[] integers = new Integer[3];
        integers = list1.toArray(integers);
        System.out.println(integers);
        Map m = new ConcurrentHashMap<>();
    }


}