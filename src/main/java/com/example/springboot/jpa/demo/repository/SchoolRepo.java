package com.example.springboot.jpa.demo.repository;

import com.example.springboot.jpa.demo.entity.SchoolEntity;
import com.example.springboot.jpa.demo.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolRepo extends JpaRepository<SchoolEntity, Long> {

    //public SchoolEntity findByName(String name);
}
