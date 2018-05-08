package com.code.community.mapper;

import com.code.community.pojo.FacilityInfo;
import com.code.community.pojo.FacilityInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FacilityInfoMapper {
    int countByExample(FacilityInfoExample example);

    int deleteByExample(FacilityInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FacilityInfo record);

    int insertSelective(FacilityInfo record);

    List<FacilityInfo> selectByExample(FacilityInfoExample example);

    FacilityInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FacilityInfo record, @Param("example") FacilityInfoExample example);

    int updateByExample(@Param("record") FacilityInfo record, @Param("example") FacilityInfoExample example);

    int updateByPrimaryKeySelective(FacilityInfo record);

    int updateByPrimaryKey(FacilityInfo record);
}