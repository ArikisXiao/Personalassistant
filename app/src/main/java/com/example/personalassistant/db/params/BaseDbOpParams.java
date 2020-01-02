package com.example.personalassistant.db.params;

/**
 * @author xiaosai
 * @email 994975664@qq.com
 * @description: 数据库操作基类
 * @date :2020/1/2 20:22
 */

public class BaseDbOpParams {

    private String mTableName;

    BaseDbOpParams(String tableName) {
        this.mTableName = tableName;
    }

    public String getTableName() {
        return mTableName;
    }
}
