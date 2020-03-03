package com.example.service;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.OtherInfo;
import com.example.model.Sample;
import com.example.repository.OtherInfoRepository;
import com.example.repository.SampleRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jt on 1/10/17.
 */
@Service
public class SampleServiceImpl implements SampleService {

    private SampleRepository sampleRepository;
    private OtherInfoRepository otherInfoRepository;

    @Autowired
    public SampleServiceImpl(SampleRepository sampleRepository,OtherInfoRepository otherInfoRepository) {
        this.sampleRepository = sampleRepository;
        this.otherInfoRepository = otherInfoRepository;
    }

	@Override
	public Sample getById(Long id) {
		// TODO Auto-generated method stub
		return sampleRepository.findOne(id);
	}

	@Override
	public void save(Sample task) {
		sampleRepository.save(task);
		
	}

	@Override
	public void saveOtherInfo(OtherInfo info) {
		// TODO Auto-generated method stub
		otherInfoRepository.save(info);
		
	}

 
}
