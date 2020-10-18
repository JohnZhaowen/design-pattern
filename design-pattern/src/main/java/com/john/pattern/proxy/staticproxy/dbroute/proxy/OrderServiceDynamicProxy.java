package com.john.pattern.proxy.staticproxy.dbroute.proxy;

import com.john.pattern.proxy.staticproxy.dbroute.Order;
import com.john.pattern.proxy.staticproxy.dbroute.db.DynamicDataSourceEntity;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        
        before(args[0]);
        Object result = method.invoke(target, args);
        after();
        return result;
    }

    private void after() {
        System.out.println("数据库路由后置增强");
        //还原成默认的数据源
        DynamicDataSourceEntity.restore();
    }

    private void before(Object order) {
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        System.out.println("数据库路由前置增强");
        //进行数据源的切换
        Integer router = Integer.valueOf(yearFormat.format(new Date(((Order)order).getCreateTIme())));
        System.out.println("动态代理类动态分配到库[DB_" + router + "]数据源处理数据");

        DynamicDataSourceEntity.set(router);
    }
}
