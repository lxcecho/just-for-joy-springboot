package com.xc.justforjoy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author lxcecho
 * @since 2020/8/3
 * <p>
 * MP会默认使用实体类的类名到数据库中找对应的表。
 */
@Data
//@TableName(value="user")
public class User {
    /**
     * @TableId: value：指定表中的主键列的列名，如果实体属性名与列名一直，可以省略不写。
     * type：指定主键策略。
     */
//    @TableId(value="id",type=IdType.AUTO)//要使用这个注解，ID必须为int类型的，否则需要给ID设置默认值。
//    private int id;
    private Long id;

    private String name;

    private Integer age;

    private String email;

    /*@TableLogic
    private Integer deleteFlag;*/

}
