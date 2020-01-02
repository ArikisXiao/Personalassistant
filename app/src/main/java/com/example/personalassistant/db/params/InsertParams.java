package com.example.personalassistant.db.params;

import android.content.ContentValues;

/**
 * @author xiaosai
 * @email 994975664@qq.com
 * @description: 进行数据库插入操作的参数
 * @date :2020/1/2 20:24
 */

public class InsertParams extends BaseDbOpParams {

    private ContentValues mContentValues;

    public InsertParams(String tableName, ContentValues contentValues) {
        super(tableName);
        mContentValues = contentValues;
    }

    public ContentValues getContentValues() {
        return mContentValues;
    }
}