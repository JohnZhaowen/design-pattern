package com.gupao.pattern.factory.operator.abstractfactory;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.Properties;

public class DataAccessFactory {

    IDaoFactory getDaoFactory() throws IOException {

        Properties properties = new Properties();
        Resource resource = new ClassPathResource("db.properties");
        properties.load(resource.getInputStream());
        String db = properties.getProperty("db", "access");
        switch (db) {
            case "sqlserver" :
                return new SqlserverDaoFactory();
            case "access" :
                return new AccessDaoFactory();
            default:
                throw new RuntimeException("不支持的数据库");
        }
    }

}
