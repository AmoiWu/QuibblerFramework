package cn.quibbler.framework.object;

/**
 * Created by Amoi on 15/9/11.
 * ---------------------------
 * This class define a base object.
 * It just import some default value in database.
 * ---------------------------
 * @author AmoiWu
 * @version v1.0
 * @since JDK_1.7
 */
public class BaseObject {

    private String _id = null;
    private String objectStatus = null;
    private String insertTime = null;

    /**
     * An empty method as constructors
     */
    public BaseObject() {
    }

    /**
     * @return
     */
    public String get_id() {
        return _id;
    }

    /**
     * @param _id
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * @return
     */
    public String getObjectStatus() {
        return objectStatus;
    }

    /**
     * @param objectStatus
     */
    public void setObjectStatus(String objectStatus) {
        this.objectStatus = objectStatus;
    }

    /**
     * @return
     */
    public String getInsertTime() {
        return insertTime;
    }

    /**
     * @param insertTime
     */
    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }
}
