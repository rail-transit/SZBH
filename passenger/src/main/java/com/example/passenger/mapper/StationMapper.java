package com.example.passenger.mapper;

import com.example.passenger.entity.Station;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StationMapper {
    Station selectStation(Integer id);

    Station selectTrain(Integer id);

    List<Station> selectAllStation(@Param("lineID") Integer lineID);

    List<Station> selectAllTrain(@Param("lineID")Integer lineID);

    List<Station> queryAllStation();

    Integer selectStationByName(@Param("lineID") Integer lineID,
                                @Param("stationID") String stationID,
                                @Param("name") String name,
                                @Param("id") Integer id);

    Integer addStation(Station station);

    Integer updateStation(Station station);

    Integer deleteStation(Integer id);

    Integer deleteStationByLineId(Integer lineID);
}
