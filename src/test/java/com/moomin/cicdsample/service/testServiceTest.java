package com.moomin.cicdsample.service;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RequiredArgsConstructor
class testServiceTest {

    private final testService service;

    @Test
    void serviceTest() {
        assertEquals(service.getNum(), 1);
    }
}