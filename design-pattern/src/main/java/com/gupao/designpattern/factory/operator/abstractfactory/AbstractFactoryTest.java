package com.gupao.designpattern.factory.operator.abstractfactory;

import java.io.IOException;

public class AbstractFactoryTest {

    public static void main(String[] args) throws IOException {

        User user = new User(1, "zhangsan");
        Department department = new Department(1, "IT");

//        IDaoFactory factory = new SqlserverDaoFactory();
        DataAccessFactory dataAccessFactory = new DataAccessFactory();
        IDaoFactory factory = dataAccessFactory.getDaoFactory();


        IDepartmentDao departmentDao = factory.createDepartmentDao();
        IUserDao userDao = factory.createUserDao();

        departmentDao.insert(department);
        departmentDao.getDepartment(1);
        userDao.insert(user);
        userDao.getUser(1);



    }
}
