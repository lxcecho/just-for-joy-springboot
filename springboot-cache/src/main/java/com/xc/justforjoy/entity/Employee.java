package com.xc.justforjoy.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author lxcecho
 * @since 2020/8/3
 */
@Data
public class Employee implements Serializable {
	
	private Integer id;

	private String lastName;

	private String email;

	@ApiModelProperty(value="性别： 1男  0女")
	private Integer gender;

	private Integer dId;

}
