package com.pluralsight.fundamentals.repository;

import javax.persistence.*;

import org.springframework.data.repository.CrudRepository;

import com.pluralsight.fundamentals.entity.Application;

public interface ApplicationRepository extends CrudRepository<Application, Long> {

}
