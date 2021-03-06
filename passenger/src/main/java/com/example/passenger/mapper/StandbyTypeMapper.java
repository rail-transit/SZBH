package com.example.passenger.mapper;

import com.example.passenger.entity.StandbyType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StandbyTypeMapper {

    List<StandbyType> selectStandbyTypePaging (@Param("pageNum") Integer pageNum,@Param("pageSize") Integer pageSize);

    List<StandbyType> selectAllStandbyType();

    Integer count();

    Integer selectStandbyTypeByName(String name);

    Integer addStandbyType(StandbyType standbyType);

    Integer updateStandbyType(StandbyType standbyType);

    Integer deleteStandbyType(Integer id);
}
