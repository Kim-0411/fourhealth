package com.fourhealth.mapper;

import java.util.List;
import java.util.Map;

import com.fourhealth.dto.Disease;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface DiseaseMapper {
    
    public int insertDiseaseListInformation(List<Map<String, Object>> data);

    public List<Disease> getDiseaseList();

}