package com.john.pattern.factory.operator.abstractfactory;

public interface IDaoFactory {

    IUserDao createUserDao();

    IDepartmentDao createDepartmentDao();
}
