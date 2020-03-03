package com.example.repository;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.OtherInfo;
import com.example.model.Sample;

/**
 * Created by jt on 1/10/17.
 */
@Repository
public interface OtherInfoRepository extends JpaRepository<OtherInfo, Long> {
	OtherInfo findFirstById(Long id);
	List<Sample> findByAge(String age);
	List<Sample> findByIdGreaterThan(Long id);
}
