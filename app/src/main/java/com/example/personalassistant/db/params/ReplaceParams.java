package com.example.personalassistant.db.params;

import android.content.ContentValues;

/**
 * @author xiaosai
 * @email 994975664@qq.com
 * @description: 进行数据库替换操作的参数
 * @date :2020/1/2 20:25
 */

public class ReplaceParams extends InsertParams {

    public ReplaceParams(String tableName, ContentValues contentValues) {
        super(tableName, contentValues);
    }
}