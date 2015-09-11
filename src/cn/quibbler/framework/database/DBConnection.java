package cn.quibbler.framework.database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Amoi on 15/9/11.
 */
public class DBConnection {

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
