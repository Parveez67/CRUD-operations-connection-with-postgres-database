package com.example.demoforAPI.repo;

import com.example.demoforAPI.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepo extends JpaRepository<Student,Long>
{
}