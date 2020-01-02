package com.example.personalassistant.db.params;

/**
 * @author xiaosai
 * @email 994975664@qq.com
 * @description: 进行数据库的删除操作的参数
 * @date :2020/1/2 20:23
 */

public class DeleteParams extends BaseDbOpParams {

    private String mWhereClause;
    private String[] mValues;

    public DeleteParams(String tableName, String whereClause, String[] values) {
        super(tableName);
        this.mWhereClause = whereClause;
        this.mValues = values;
    }

    public String getWhereClause() {
        return mWhereClause;
    }

    public String[] getValues() {
        return mValues;
    }
}