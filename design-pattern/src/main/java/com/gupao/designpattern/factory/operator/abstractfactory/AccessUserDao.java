package com.gupao.designpattern.factory.operator.abstractfactory;

public class AccessUserDao implements IUserDao {

    @Override
    public void insert(User user){
        System.out.println("在Access中给User表增加一条记录");
    }

    @Override
    public User getUser(int id){
        System.out.println("在Access中根据ID得到User表的一条记录");
        return null;
    }
}
