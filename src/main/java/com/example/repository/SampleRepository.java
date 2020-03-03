package com.example.repository;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Sample;

/**
 * Created by jt on 1/10/17.
 */
@Repository
public interface SampleRepository extends JpaRepository<Sample, Long> {
	Sample findFirstById(Long id);
	List<Sample> findByFirstName(String name);
	List<Sample> findByIdGreaterThan(Long id);
}
