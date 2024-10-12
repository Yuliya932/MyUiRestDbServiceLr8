package ru.maslova.MyUiRestDbServiceLr8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.maslova.MyUiRestDbServiceLr8.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
