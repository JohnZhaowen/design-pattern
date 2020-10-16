package com.gupao.pattern.factory.operator.abstractfactory;

public interface IDaoFactory {

    IUserDao createUserDao();

    IDepartmentDao createDepartmentDao();
}
