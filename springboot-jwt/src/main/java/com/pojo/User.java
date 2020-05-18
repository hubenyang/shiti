package com.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author hubenyang
 * @date 16:02 2019/06/14
 */
@Table(name = "user")
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User {
    @Id
    private String id;

    private String username;

    private String password;

    private String loginTime;


    private String  ip;

//    private String description;
}
