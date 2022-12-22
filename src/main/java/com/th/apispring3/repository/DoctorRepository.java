package com.th.apispring3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.th.apispring3.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long>{
}
