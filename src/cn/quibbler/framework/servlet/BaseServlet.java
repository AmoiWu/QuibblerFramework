package cn.quibbler.framework.servlet;

import cn.quibbler.framework.database.DBConnection;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import java.sql.Connection;

/**
 * Created by Amoi on 15/9/11.
 */
public class BaseServlet extends HttpServlet {

    public Connection getConnection(ServletContext context) {

        String dbUrl = context.getInitParameter("DBUrl");
        String dbName = context.getInitParameter("DBName");
        String dbUser = context.getInitParameter("DBUser");
        String dbPassword = context.getInitParameter("DBPassword");

        return DBConnection.connect(dbUrl, dbName, dbUser, dbPassword);
    }
}
