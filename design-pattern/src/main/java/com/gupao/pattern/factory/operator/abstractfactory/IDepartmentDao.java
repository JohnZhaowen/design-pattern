package com.gupao.pattern.factory.operator.abstractfactory;

public interface IDepartmentDao {

    void insert(Department department);

    Department getDepartment(int id);
}
