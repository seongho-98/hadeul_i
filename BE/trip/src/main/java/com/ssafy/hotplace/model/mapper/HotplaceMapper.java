package com.ssafy.hotplace.model.mapper;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.hotplace.model.dto.HotplaceDto;

@Mapper
public interface HotplaceMapper {
	
	public int insert(HotplaceDto hotplace) throws SQLException;

}