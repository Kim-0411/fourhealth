package com.fourhealth.mapper;

/*
 * SNS 관련
 */

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fourhealth.dto.Sns;

@Mapper
public interface SnsMapper {

	public int addSns(Sns sns);

	public List<Sns> getSnsList();
}
