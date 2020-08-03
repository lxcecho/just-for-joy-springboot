package com.xc.justforjoy.mapper;

import com.xc.justforjoy.entity.Department;
import org.apache.ibatis.annotations.*;

/**
 * @author lxcecho
 * @since 2020/8/3
 */
@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department(department_name) values(#{departmentName})")
    int insertDept(Department department);

    @Update("update department set department_name=#{departmentName} where id=#{id}")
    int updateDept(Department department);

}
