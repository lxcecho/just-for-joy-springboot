package com.xc.justforjoy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xc.justforjoy.entity.User;

/**
 * @author lxcecho
 * @since 2020/8/3
 * <p>
 * 基于MyBatis：在Mapper接口中编写CRUD相关的方法，提供Mapper接口所对应的SQL映射文件以及方法对应的SQL语句。
 * 基于MP：让XXXMapper接口继承BaseMapper接口即可。
 * BaseMapper<T>：泛型指定的就是当前Mapper接口所操作的实体类型。
 */
public interface UserMapper extends BaseMapper<User> {

}
