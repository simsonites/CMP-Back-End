package com.softpager.icmp.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.softpager.icmp.entities.Student;

public interface StudentRepository  extends JpaRepository<Student, Long>{


}
