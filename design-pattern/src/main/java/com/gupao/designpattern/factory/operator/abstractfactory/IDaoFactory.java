package com.gupao.designpattern.factory.operator.abstractfactory;

public interface IDaoFactory {

    IUserDao createUserDao();

    IDepartmentDao createDepartmentDao();
}
