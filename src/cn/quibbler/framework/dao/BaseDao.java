package cn.quibbler.framework.dao;

import java.util.ArrayList;

/**
 * Created by Amoi on 15/9/11.
 */
public interface BaseDao {

    public String insertData(Object object);
    public boolean deleteData(String _id);
    public boolean updateData(Object object);
    public Object selectData(String _id);
    public ArrayList<Object> selectData();
}
