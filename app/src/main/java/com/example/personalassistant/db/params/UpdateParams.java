package com.example.personalassistant.db.params;

import android.content.ContentValues;

/**
 * @author xiaosai
 * @email 994975664@qq.com
 * @description: 进行数据库更新操作时的参数
 * @date :2020/1/2 20:25
 */

public class UpdateParams extends DeleteParams {

    private ContentValues mContentValues;

    public UpdateParams(String tableName, String whereClause, String[] values, ContentValues contentValues) {
        super(tableName, whereClause, values);
        mContentValues = contentValues;
    }

    public ContentValues getContentValues() {
        return mContentValues;
    }
}