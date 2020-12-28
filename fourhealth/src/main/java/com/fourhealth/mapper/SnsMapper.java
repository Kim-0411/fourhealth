package com.fourhealth.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.Sns;


@Mapper
public interface SnsMapper {

	public int addSns(Sns sns);

	public List<Sns> getSnsList();
}
