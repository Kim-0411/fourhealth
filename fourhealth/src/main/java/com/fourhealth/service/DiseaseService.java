package com.fourhealth.service;

import java.util.List;

import com.fourhealth.dto.Disease;
import com.fourhealth.mapper.DiseaseMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DiseaseService {
    @Autowired DiseaseMapper diseaseMapper;

    public List<Disease> getDiseaseList(){

        return diseaseMapper.getDiseaseList();
    }
    
}
