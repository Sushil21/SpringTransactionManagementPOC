package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.OtherInfo;
import com.example.model.Sample;
import com.example.repository.SampleRepository;
import com.example.service.OnBoardUserService;
import com.example.service.SampleService;
import com.example.service.SampleServiceImpl;
 


@RestController
public class HelloController {
	
	@Autowired
	 private SampleRepository sampleRepository;
	
	@Autowired
	private OnBoardUserService onBoardUserService;
	
	@RequestMapping(value="/testing",method=RequestMethod.GET)
	public @ResponseBody String sampleAPI(){
		Sample task = new Sample();
		task.setFirstName("sushill");
		OtherInfo info = new OtherInfo();
		info.setAge("20");
		onBoardUserService.onBoardUser(task, info);
//		sampleRepository.save(task);
//		
//		Sample task1  = sampleRepository.findFirstById(1L);
//		System.out.println("data received"+task1);
//		
//		
//		List<Sample> list = sampleRepository.findByFirstName("sushil");
//		System.out.println("list::"+list);
		return "Hello World!!!!!";
	}

	
	 
}
