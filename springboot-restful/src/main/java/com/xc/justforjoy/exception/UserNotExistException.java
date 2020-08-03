package com.xc.justforjoy.exception;

/**
 * @author lxcecho
 * @since 2020/8/3
 */
public class UserNotExistException extends RuntimeException {

    public UserNotExistException(){
        super("用户不存在");
    }

}
