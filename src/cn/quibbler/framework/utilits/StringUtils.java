package cn.quibbler.framework.utilits;

import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Amoi on 15/9/11.
 * ---------------------------
 * There are some static method of utility.
 * Import md5, isEmpty, getNowTime, getColumnId.
 * ---------------------------
 * @author AmoiWu
 * @version v1.0
 * @since JDK_1.7
 */
public class StringUtils {

    /**
     * @param source
     * Get source from input, and sum as MD5
     * @return
     */
    public static String md5(String source) {

        char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        try {
            byte[] btInput = source.getBytes();
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            mdInst.update(btInput);
            byte[] md = mdInst.digest();
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @param source
     * Get source from input, and sum as MD5
     * @return
     */
    public static boolean isEmpty(String source) {

        if (source == null || source.equals("")) {
            return true;
        }

        return false;
    }

    /**
     * @return
     */
    public static String getNowTime() {

        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    /**
     * @return
     */
    public static String getColumnId() {

        return md5(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
    }
}
