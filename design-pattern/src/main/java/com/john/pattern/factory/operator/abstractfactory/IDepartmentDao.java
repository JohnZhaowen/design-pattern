package com.john.pattern.factory.operator.abstractfactory;

public interface IDepartmentDao {

    void insert(Department department);

    Department getDepartment(int id);
}
