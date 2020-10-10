package com.hp.docker_base.mapper;

import com.hp.docker_base.bean.MDC2;
import com.hp.docker_base.bean.MDC2Example;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MDC2Mapper {
    int countByExample(MDC2Example example);

    int deleteByExample(MDC2Example example);

    int deleteByPrimaryKey(Integer rule);

    int insert(MDC2 record);

    int insertSelective(MDC2 record);

    List<MDC2> selectByExample(MDC2Example example);

    MDC2 selectByPrimaryKey(Integer rule);

    int updateByExampleSelective(@Param("record") MDC2 record, @Param("example") MDC2Example example);

    int updateByExample(@Param("record") MDC2 record, @Param("example") MDC2Example example);

    int updateByPrimaryKeySelective(MDC2 record);

    int updateByPrimaryKey(MDC2 record);
}