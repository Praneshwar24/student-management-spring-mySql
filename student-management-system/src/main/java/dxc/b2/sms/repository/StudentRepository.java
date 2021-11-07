package dxc.b2.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dxc.b2.sms.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long>{

}