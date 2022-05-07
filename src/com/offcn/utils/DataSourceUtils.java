package com.offcn.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;

public class DataSourceUtils {
    private static DataSource ds;
    //获取数据源
    public static DataSource getDataSource(){
        ds = new ComboPooledDataSource();
        return ds;
    }
}
