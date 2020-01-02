package com.example.personalassistant.db.helper;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.personalassistant.db.DatabaseException;
import com.example.personalassistant.db.DatabaseUtils;
import com.example.personalassistant.db.params.DeleteParams;
import com.example.personalassistant.db.params.InsertParams;
import com.example.personalassistant.db.params.ReplaceParams;
import com.example.personalassistant.db.params.UpdateParams;

import java.util.List;

/**
 * @author xiaosai
 * @email 994975664@qq.com
 * @description: 所有数据库的Helper都要继承此类，此类封装了所有数据库的基本操作。
 * @date :2020/1/2 20:28
 */

public abstract class BaseDatabaseHelper extends SQLiteOpenHelper {

    private static final String TAG = BaseDatabaseHelper.class.getSimpleName();

    protected boolean mUpgradeSuccess = true;

    public BaseDatabaseHelper(Context context, String name, int version) {
        super(context, name, null, version);
    }

    public void closeDb() {
        try {
            SQLiteDatabase db = getWritableDatabase();
            if (db != null) {
                db.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 插入数据
     */
    public void insert(InsertParams params) throws DatabaseException {
        DatabaseUtils.insert(this, params);
    }

    /**
     * 插入一组数据
     */
    public void insert(List<InsertParams> params) throws DatabaseException {
        DatabaseUtils.insert(this, params);
    }

    /**
     * 查询数据
     */
    public Cursor query(String tableName, String[] projection, String selection, String[] selectionArgs,
                        String groupBy, String having, String sortOrder) throws DatabaseException {
        return DatabaseUtils.query(this, tableName, projection, selection, selectionArgs, groupBy, having, sortOrder);
    }

    /**
     * 更新数据
     */
    public int update(UpdateParams params) throws DatabaseException {
        return DatabaseUtils.update(this, params);
    }

    /**
     * 删除数据
     */
    public int delete(DeleteParams params) throws DatabaseException {
        return DatabaseUtils.delete(this, params);
    }

    /**
     * 删除数据
     */
    public void delete(List<DeleteParams> params) throws DatabaseException {
        DatabaseUtils.delete(this, params);
    }

    /**
     * 原生SQL语句查询
     */
    public Cursor rawQuery(String sql, String[] argues) throws DatabaseException {
        return DatabaseUtils.rawQuery(this, sql, argues);
    }

    /**
     * 替换数据
     */
    public void replace(ReplaceParams params) throws DatabaseException {
        DatabaseUtils.replace(this, params);
    }

    /**
     * 替换一组数据
     */
    public void replace(List<ReplaceParams> params) throws DatabaseException {
        DatabaseUtils.replace(this, params);
    }

    /**
     * 清空一张表的数据
     */
    public void clearTable(String tableName) throws DatabaseException {
        DatabaseUtils.clearTable(this, tableName);
    }
}