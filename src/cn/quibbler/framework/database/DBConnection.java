package cn.quibbler.framework.database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Amoi on 15/9/11.
 * ---------------------------
 * This is a connection-database class.
 * Input your user name and password to connect the database that you defined.
 * ---------------------------
 * @author AmoiWu
 * @version v1.0
 * @since JDK_1.7
 */
public class DBConnection {

    /**
     * @param dbUrl
     * Database URL.
     * @param dbName
     * Database name.
     * @param dbUser
     * Set a user can read and write the database that you define.
     * @param dbPassword
     * Set a password for user.
     * @return
     * Return a data as Connection.
     */
    public static Connection connect(String dbUrl, String dbName, String dbUser, String dbPassword) {

        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbUrl + dbName, dbUser, dbPassword);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Database Connect Error!");
        }

        return conn;
    }
}
