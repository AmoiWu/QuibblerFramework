package cn.quibbler.framework.impl;

import cn.quibbler.framework.dao.BaseDao;

import java.util.ArrayList;

/**
 * Created by Amoi on 15/10/7.
 * ---------------------------
 * The class implements some DAO from interface BaseDao.
 * Some function that you can re-define here.
 * ---------------------------
 * @author AmoiWu
 * @version v1.0
 * @since JDK_1.7
 */
public class BaseImpl implements BaseDao {

    /**
     *
     * @param object
     * Set a object, include all kind type that extends from class Object.
     * @return
     */
    @Override
    public String insertData(Object object) {
        return null;
    }

    /**
     *
     * @param _id
     * Set a string that the table id in database.
     * @return
     */
    @Override
    public boolean deleteData(String _id) {
        return false;
    }

    /**
     *
     * @param object
     * Set a object, include all kind type that extends from class Object.
     * @return
     */
    @Override
    public boolean updateData(Object object) {
        return false;
    }

    /**
     *
     * @param _id
     * Set a string that the table id in database.
     * @return
     */
    @Override
    public Object selectData(String _id) {
        return null;
    }

    /**
     *
     * @return
     */
    @Override
    public ArrayList<Object> selectData() {
        return null;
    }
}
