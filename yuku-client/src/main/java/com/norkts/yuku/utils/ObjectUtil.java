package com.norkts.yuku.utils;

/**
 * object常用操作
 * @author norkts<norkts@gmail.com>
 */
public class ObjectUtil {

    /**
     * 如果为null,则返回默认值
     * @param val 要判断的值
     * @param defaultVal 默认值
     * @param <T> 泛型类型
     * @return
     */
    public static <T> T defaultIfNull(T val, T defaultVal){
        if(val == null){
            return defaultVal;
        }

        return val;
    }
}
