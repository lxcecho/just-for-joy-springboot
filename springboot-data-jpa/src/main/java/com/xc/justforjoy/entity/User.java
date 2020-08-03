package com.xc.justforjoy.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author lxcecho
 * @since 2020/8/3
 *
 * 使用Jpa注解配置映射关系
 */
@Data
/*告诉JPA这是一个实体类（和数据表映射的类）*/
@Entity
/*@Table 来指定和哪个数据表对应；如果省略 默认表明就是user*/
@Table(name="tbl_user")
public class User {

    @Id/*这是一个主键*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)/*自增主键*/
    private Integer id;

    @Column(name="last_name",length = 50)/*这是和数据表对应的一个列*/
    private String lastName;

    @Column/*省略默认列名就是属性名*/
    private String email;

}
