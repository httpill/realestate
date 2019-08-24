package com.yibayi.core.permission.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Token属性
 * @author guocy
 * springboot启动时注入对象，属性来自application.yml yibayi.token节点
 * */
@Data
public class Token implements Serializable {

    private static final long serialVersionUID = 5204322188209024904L;

    //cookie名称
    private String cookieName;


}
