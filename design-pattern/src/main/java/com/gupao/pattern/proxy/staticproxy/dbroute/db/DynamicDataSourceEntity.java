package com.gupao.pattern.proxy.staticproxy.dbroute.db;

public class DynamicDataSourceEntity {

    private final static ThreadLocal<String> local = new ThreadLocal<>();

    private DynamicDataSourceEntity(){}

    public static String get(){
        return local.get();
    }

    public static void restore(){
        local.set(null);
    }

    /**
     * 订单根据时间分库，传入的source为库名，如：
     * DB_2018,DB_2019...
     * @param source
     */
    public static void set(String source){
        local.set(source);
    }

    public static void set(int year){
        local.set("DB_" + year);
    }
}
