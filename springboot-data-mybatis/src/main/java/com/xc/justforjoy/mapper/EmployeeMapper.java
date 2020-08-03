package com.xc.justforjoy.mapper;

import com.xc.justforjoy.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author lxcecho
 * @since 2020/8/3
 */
@Mapper
public interface EmployeeMapper {

    @Select("select * from employee where id=#{id}")
    Employee getEmpById(Integer id);

}
