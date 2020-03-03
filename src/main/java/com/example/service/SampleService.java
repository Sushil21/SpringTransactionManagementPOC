package com.example.service;
 

import java.util.List;

import com.example.model.OtherInfo;
import com.example.model.Sample;

/**
 * Created by jt on 1/10/17.
 */
public interface SampleService {

    Sample getById(Long id);
    void save(Sample task);
    void saveOtherInfo(OtherInfo info);

}
