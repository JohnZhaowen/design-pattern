package com.gupao.designpattern.factory.operator.abstractfactory;

public class AccessDaoFactory implements IDaoFactory {
    @Override
    public IUserDao createUserDao() {
        return new AccessUserDao();
    }

    @Override
    public IDepartmentDao createDepartmentDao() {
        return new AccessDepartmentDao();
    }
}
