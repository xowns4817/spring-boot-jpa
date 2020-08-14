package com.example.springboot.jpa.demo.repository;

import com.example.springboot.jpa.demo.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentEntity, Long> {
}
