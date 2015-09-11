package cn.quibbler.framework.object;

/**
 * Created by Amoi on 15/9/11.
 */
public class BaseObject {

    private String _id = null;
    private String objectStatus = null;
    private String insertTime = null;

    public BaseObject() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getObjectStatus() {
        return objectStatus;
    }

    public void setObjectStatus(String objectStatus) {
        this.objectStatus = objectStatus;
    }

    public String getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }
}
