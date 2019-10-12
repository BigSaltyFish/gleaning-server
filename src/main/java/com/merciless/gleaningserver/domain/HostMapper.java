package com.merciless.gleaningserver.domain;

import java.util.ArrayList;

import com.merciless.gleaningserver.service.thrift.Host;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.dao.DataAccessException;

@Mapper
public interface HostMapper {

    @Select("SELECT * FROM hosts")
    ArrayList<Host> getAllHosts() throws DataAccessException;
}