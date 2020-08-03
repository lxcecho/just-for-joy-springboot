package com.xc.justforjoy.mapper;

import com.xc.justforjoy.entity.Employee;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author lxcecho
 * @since 2020/8/3
 */
@Mapper
@Repository
public interface EmployeeMapper {
    @Select("select * from employee where id=#{id}")
    Employee getEmpById(Integer id);
}
