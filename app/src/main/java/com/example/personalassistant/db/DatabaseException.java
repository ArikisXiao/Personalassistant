package com.example.personalassistant.db;

/**
 * @author xiaosai
 * @email 994975664@qq.com
 * @description: 数据库异常报错
 * @date :2020/1/2 20:29
 */

public class DatabaseException extends Exception {

    public DatabaseException(Exception e) {
        super(e);
    }

    public DatabaseException(String msg) {
        super(msg);
    }
}