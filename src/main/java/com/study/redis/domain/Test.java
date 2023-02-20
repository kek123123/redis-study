package com.study.redis.domain;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Getter
@RedisHash(value = "test", timeToLive = 30)
public class Test {

    @Id
    private String id;
    private String title;
    private String content;

    public Test(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
