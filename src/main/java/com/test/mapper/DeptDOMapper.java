package com.test.mapper;

import com.test.mybatis.DeptDO;
import com.test.mybatis.DeptDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptDOMapper {
    int countByExample(DeptDOExample example);

    int deleteByExample(DeptDOExample example);

    int deleteByPrimaryKey(Long deptno);

    int insert(DeptDO record);

    int insertSelective(DeptDO record);

    List<DeptDO> selectByExample(DeptDOExample example);

    DeptDO selectByPrimaryKey(Long deptno);

    int updateByExampleSelective(@Param("record") DeptDO record, @Param("example") DeptDOExample example);

    int updateByExample(@Param("record") DeptDO record, @Param("example") DeptDOExample example);

    int updateByPrimaryKeySelective(DeptDO record);

    int updateByPrimaryKey(DeptDO record);
}