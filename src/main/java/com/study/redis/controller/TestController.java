package com.study.redis.controller;

import com.study.redis.domain.Test;
import com.study.redis.repository.TestRedisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestRedisRepository testRedisRepository;

    @GetMapping("/")
    public void test() {
        Test test = new Test("title", "content");

        testRedisRepository.save(test);

        Test findTest = testRedisRepository.findById(test.getId()).get();

        System.out.println("findTest = " + findTest.getTitle());
        System.out.println("findTest = " + findTest.getContent());
    }
}
