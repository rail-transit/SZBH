package com.example.passenger.mapper;

import com.example.passenger.entity.PlayListScope;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlayListScopeMapper {

    PlayListScope selectPlayListScope(Integer listID);

    List<PlayListScope> selectPaging(@Param("pageNum") Integer pageNum,@Param("pageSize") Integer pageSize);

    Integer count();

    Integer addPlayListScope(PlayListScope playListScope);

    Integer updatePlayListScope(PlayListScope playListScope);

    Integer deletePlayListScope(Integer listID);
}
