package cn.quibbler.framework.database;

/**
 * Created by Amoi on 15/9/11.
 */
public class SQLHelper {

    public static String insertSql(String table, String column, String data) {

        return "INSERT INTO " + table + " (" + column + ") VALUES (" + data + ")";
    }

    public static String deleteSql(String table, String _id) {

        return "DELETE FROM  " + table + " WHERE _id = '" + _id + "'";
    }

    public static String updateSql(String table, String _id, String data) {

        return "UPDATE " + table + " SET " + data + " WHERE _id = '" + _id + "'";
    }

    public static String selectSql(String table, String _id) {

        return "SELECT * FROM " + table + " WHERE _id = '" + _id + "'";
    }

    public static String selectSql(String table) {

        return "SELECT * FROM " + table;
    }
}