package cn.quibbler.framework.database;

/**
 * Created by Amoi on 15/9/11.
 * ---------------------------
 * This class can use some static method to create SQL Strings.
 * This class has been deprecated, please use the SQL strings.
 * ---------------------------
 * @author AmoiWu
 * @version v1.0
 * @since JDK_1.7
 * @deprecated If you want to insert data, Please use the SQL String.
 */
public class SQLHelper {

    /**
     * @param table
     * The table that you want to set in the database.
     * @param column
     * The column that you want to aim in the table.
     * @param data
     * The data that you want to insert to the table.
     * @return
     * Return a SQL String.
     */
    public static String insertSql(String table, String column, String data) {

        return "INSERT INTO " + table + " (" + column + ") VALUES (" + data + ")";
    }

    /**
     * @param table
     * The table that you want to set in the database.
     * @param _id
     * The data id that you want to delete in the table of the database.
     * @return
     * Return a SQL String.
     */
    public static String deleteSql(String table, String _id) {

        return "DELETE FROM  " + table + " WHERE _id = '" + _id + "'";
    }

    /**
     * @param table
     * The table that you want to set in the database.
     * @param _id
     * The data id that you want to update in the table of the database.
     * @param data
     * The data that you want to update to the table.
     * @return
     * Return a SQL String.
     */
    public static String updateSql(String table, String _id, String data) {

        return "UPDATE " + table + " SET " + data + " WHERE _id = '" + _id + "'";
    }

    /**
     * @param table
     * The table that you want to set in the database.
     * @param _id
     * The data id that you want to select in the table of the database.
     * @return
     * Return a SQL String.
     */
    public static String selectSql(String table, String _id) {

        return "SELECT * FROM " + table + " WHERE _id = '" + _id + "'";
    }

    /**
     * @param table
     * The table that you want to set in the database.
     * @return
     * Return a SQL String.
     */
    public static String selectSql(String table) {

        return "SELECT * FROM " + table;
    }
}