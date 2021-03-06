package com.example.passenger.mapper;

import com.example.passenger.entity.MapEntity;
import org.apache.ibatis.annotations.Param;


public interface MapEntityMapper {
    MapEntity selectMapByID(String id);

    Integer addMap(@Param("id") String id,@Param("path") String path);

    Integer updateMap(@Param("id") String id,@Param("path") String path);
}
