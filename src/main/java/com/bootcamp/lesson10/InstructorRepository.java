package com.bootcamp.lesson10;

import org.springframework.data.repository.CrudRepository;

public interface InstructorRepository extends CrudRepository<Instructor, Long> {
}
