package com.john.pattern.factory.operator.abstractfactory;

public interface IUserDao {

    void insert(User user);

    User getUser(int id);
}
