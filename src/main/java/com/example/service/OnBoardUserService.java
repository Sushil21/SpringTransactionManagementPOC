package com.example.service; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.OtherInfo;
import com.example.model.Sample;

@Service
public class OnBoardUserService {
	
	@Autowired
	private SampleServiceImpl sampleServiceImpl;
	
	@Transactional
	public void onBoardUser(Sample sample, OtherInfo otherInfo) {
		sampleServiceImpl.save(sample);
		if(sample.getFirstName().startsWith("sus")) {
			throw new RuntimeException("thowing exception to test transaction rollback");
		}
		//throw new RuntimeException("thowing exception to test transaction rollback");
		sampleServiceImpl.saveOtherInfo(otherInfo);
	}

}
