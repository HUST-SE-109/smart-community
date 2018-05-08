package com.code.community.mapper;

import com.code.community.pojo.ForeignPerson;
import com.code.community.pojo.ForeignPersonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ForeignPersonMapper {
    int countByExample(ForeignPersonExample example);

    int deleteByExample(ForeignPersonExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ForeignPerson record);

    int insertSelective(ForeignPerson record);

    List<ForeignPerson> selectByExample(ForeignPersonExample example);

    ForeignPerson selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ForeignPerson record, @Param("example") ForeignPersonExample example);

    int updateByExample(@Param("record") ForeignPerson record, @Param("example") ForeignPersonExample example);

    int updateByPrimaryKeySelective(ForeignPerson record);

    int updateByPrimaryKey(ForeignPerson record);
}