package com.moomin.cicdsample.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SampleServiceTest {

    @Autowired
    private SampleService service;

    @Test
    void serviceTest() {
        assertEquals(1, service.getNum());
    }

    // @Test
    // void serviceTest2() {
    //     assertEquals(2, service.plusNum());
    // }
}