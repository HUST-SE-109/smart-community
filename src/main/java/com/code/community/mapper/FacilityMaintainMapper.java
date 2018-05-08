package com.code.community.mapper;

import com.code.community.pojo.FacilityMaintain;
import com.code.community.pojo.FacilityMaintainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FacilityMaintainMapper {
    int countByExample(FacilityMaintainExample example);

    int deleteByExample(FacilityMaintainExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FacilityMaintain record);

    int insertSelective(FacilityMaintain record);

    List<FacilityMaintain> selectByExample(FacilityMaintainExample example);

    FacilityMaintain selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FacilityMaintain record, @Param("example") FacilityMaintainExample example);

    int updateByExample(@Param("record") FacilityMaintain record, @Param("example") FacilityMaintainExample example);

    int updateByPrimaryKeySelective(FacilityMaintain record);

    int updateByPrimaryKey(FacilityMaintain record);
}