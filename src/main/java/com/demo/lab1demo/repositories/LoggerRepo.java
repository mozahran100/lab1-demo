package com.demo.lab1demo.repositories;

import com.demo.lab1demo.models.Logger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoggerRepo extends CrudRepository<Logger, Integer> {
}
