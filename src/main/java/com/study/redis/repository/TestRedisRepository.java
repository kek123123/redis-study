package com.study.redis.repository;

import com.study.redis.domain.Test;
import org.springframework.data.repository.CrudRepository;

public interface TestRedisRepository extends CrudRepository<Test, String> {
}
