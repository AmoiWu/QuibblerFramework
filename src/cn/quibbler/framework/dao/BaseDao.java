package cn.quibbler.framework.dao;

import java.util.ArrayList;

/**
 * Created by Amoi on 15/9/11.
 * ---------------------------
 * This interface is a Data Access Object to set database.
 * Some base function is define here.
 * ---------------------------
 * @author AmoiWu
 * @version v1.0
 * @since JDK_1.7
 */
public interface BaseDao {

    /**
     * @param object
     * Set a object, include all kind type that extends from class Object.
     * @return
     * Default is null.
     */
    String insertData(Object object);

    /**
     * @param _id
     * Set a string that the table id in database.
     * @return
     * Default is false.
     */
    boolean deleteData(String _id);

    /**
     * @param object
     * Set a object, include all kind type that extends from class Object.
     * @return
     * Default is false.
     */
    boolean updateData(Object object);

    /**
     * @param _id
     * Set a string that the table id in database.
     * @return
     * Default is null.
     * You can return any type that you defined under the class Object.
     */
    Object selectData(String _id);

    /**
     * @return
     * Default is null.
     * But the type has been defined as ArrayList.
     */
    ArrayList<Object> selectData();
}
