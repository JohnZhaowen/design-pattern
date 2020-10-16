package com.gupao.pattern.factory.operator.abstractfactory;

public class SqlserverDaoFactory implements IDaoFactory {
    @Override
    public IUserDao createUserDao() {
        return new SqlserverUserDao();
    }

    @Override
    public IDepartmentDao createDepartmentDao() {
        return new SqlserverDepartmentDao();
    }
}
