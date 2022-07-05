package com.moomin.cicdsample.service;

import org.springframework.stereotype.Service;

@Service
public class SampleService {
    private int num = 1;

    int plusNum() {
        return num + 1;
    }

    int getNum() {
        return this.num;
    }
}
